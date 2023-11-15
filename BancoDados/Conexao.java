import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conexao {
    protected String banco;
    protected String usuario;
    protected String senha;

    public Conexao(String banco, String usuario, String senha) {
        this.banco = banco;
        this.usuario = usuario;
        this.senha = senha;
    }
    public void ConexaoBD() {
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+this.banco,
                    this.usuario,
                    this.senha
                );
            System.out.println("Conexão estabelecida!");
            /*PreparedStatement ps = connManager.prepareStatement("SELECT * FROM usuario");
           // ps.setString(1, "%JA%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome_usuario")+"  "+rs.getString("email")+"  "+rs.getString("senha"));
            }*/
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    // todo: Inserir usuario---------------------------------------------------
    public void InserirUsuario(String nome, String email, String senha){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+this.banco,
                this.usuario,
                this.senha
            );
            String sql = "INSERT INTO usuario (nome_usuario, email, senha) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, nome);
                statement.setString(2, email);
                statement.setString(3, senha);

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Usuário cadastrado com sucesso!");
                } else {
                    System.out.println("Falha ao cadastrar o usuário.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // todo: Alterar usuario---------------------------------------------------
    public void AlterarUsuario(Integer id, String nome, String email){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+this.banco,
                this.usuario,
                this.senha
            );
            String sql = "UPDATE usuario SET nome_usuario = ?, email = ? WHERE id = ?";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, nome);
                statement.setString(2, email);
                statement.setInt(3, id);

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Usuário alterado com sucesso!");
                } else {
                    System.out.println("Falha ao alterar o usuário.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // todo: Selecionar Usuario------------------------------------------------
    public void SelecionarUsuario(int op){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+this.banco,
                    this.usuario,
                    this.senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();
            if(op==1){
                int i=1;
                while (rs.next()) {   
                System.out.println("["+i+"] => "+rs.getString("nome_usuario")+"  "+rs.getString("email"));
                i++;
                }
            }else{
                while (rs.next()) {
                System.out.println(rs.getString("nome_usuario")+"  "+rs.getString("email"));
            }
            }
            while (rs.next()) {
                System.out.println(rs.getString("nome_usuario")+"  "+rs.getString("email"));
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    // todo: Selecionar Usuario Expecifico-------------------------------------
    public void SelecionarUsuarioExpecifico(int id){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+this.banco,
                    this.usuario,
                    this.senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT nome_usuario FROM sistema.usuario WHERE id="+id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome_usuario"));
            }
            connManager.close();           
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    // todo: Selecionar Excluir Usuario Expecifico-----------------------------  
    public void ExcluirUsuarioExpecifico(int p1){
        try{
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+this.banco,
                this.usuario,
                this.senha
            );
            // SQL para deletar um usuário
            String sql = "DELETE FROM usuario WHERE id = ?";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define o parâmetro (ID do usuário)
                statement.setInt(1, p1);
                // Executa o comando de exclusão
                int linhasAfetadas = statement.executeUpdate();
                if (linhasAfetadas > 0) {
                    System.out.println("Usuário deletado com sucesso!");
                } else {
                    System.out.println("Nenhum usuário foi deletado. Verifique o ID do usuário.");
                }
                connManager.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // todo: Logar Usuario Expecifico------------------------------------------
    public ArrayList LogarUsuarioExpecifico(ArrayList<String> usuarios){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+this.banco,
                    this.usuario,
                    this.senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM usuario");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuarios.add(rs.getString("nome_usuario")+rs.getString("senha"));
            }
            connManager.close();           
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return usuarios;
    }
}
