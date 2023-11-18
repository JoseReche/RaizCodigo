import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Conexao {
    protected static String banco = "biblioteca";
    protected static String usuario = "root";
    protected static String senha = "";

    public static void ConexaoBD() {
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
    //Inserir autor-----------------------------------------------------
    public static void InserirAutor(Autor autor){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+ banco,
                usuario,
                senha
            );
            String sql = "INSERT INTO autor (nome_autor,nac_autor) VALUES (?, ?)";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, autor.getNome());
                statement.setString(2, autor.getNacionalidade());

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Autor cadastrado com sucesso!");
                } else {
                    System.out.println("Falha ao cadastrar o Autor.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //listar autor-----------------------------------------------------
    public static void listarAutores(int op){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM autor");
            ResultSet rs = ps.executeQuery();
            if(op==1){
                int i=1;
                while (rs.next()) {   
                    System.out.println("["+i+"] => "+rs.getString("nome_autor")+"  "+rs.getString("nac_autor"));
                    i++;
                }
            }else{
                while (rs.next()) {
                    System.out.println(rs.getString("nome_autor")+"  "+rs.getString("nac_autor"));
                }
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    //Contar autor-----------------------------------------------------
    public static Integer ContarAutores(){
        int i=0;
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM autor");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                i++;
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return i;
    }
    //Selecionar autor
    public static Autor SelecionarAutor(int id){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT id_autor, nome_autor, nac_autor FROM biblioteca.autor WHERE id="+id);
            ResultSet rs = ps.executeQuery();
            Autor autor = new Autor(
                rs.getInt("id_autor"),
                rs.getString("nome_autor"),
                rs.getString("nac_autor")
            );
            connManager.close();           
            return autor;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
    
    //Inserir midiaDigital-----------------------------------------------------
    public static void InserirMidiaDigital(MidiaDigital midiaDigital) {
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+ banco,
                usuario,
                senha
            );
            String sql = "INSERT INTO midia_digital (titulo,disponivel,album) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, midiaDigital.getTitulo());
                statement.setBoolean(2, midiaDigital.getDisponivel());
                statement.setString(3, midiaDigital.getAlbum());

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Midia digital cadastrado com sucesso!");
                } else {
                    System.out.println("Falha ao cadastrar o Midia digital.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //listar autor-----------------------------------------------------
    public static void listarMidiaDigital(int op){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM midia_digital");
            ResultSet rs = ps.executeQuery();
            if(op==1){
                int i=1;
                while (rs.next()) {
                    System.out.println("["+i+"] => "+
                    rs.getString("titulo")+"  "+
                    rs.getBoolean("album")+"  "+
                    rs.getBoolean("disponivel"));
                    i++;
                }
            }else{
                while (rs.next()) {
                    System.out.println(rs.getString("titulo")+"  "+
                    rs.getBoolean("album")+"  "+
                    rs.getBoolean("disponivel"));
                }
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    
    //Inserir autor-----------------------------------------------------
    public static void InserirLivro(Livro livro){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+ banco,
                usuario,
                senha
            );
            String sql = "INSERT INTO autor (titulo,autor,disponivel) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, livro.getTitulo());
                statement.set(2, livro.getAutor());

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Autor cadastrado com sucesso!");
                } else {
                    System.out.println("Falha ao cadastrar o Autor.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //listar autor-----------------------------------------------------
    public static void listarAutores(int op){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM autor");
            ResultSet rs = ps.executeQuery();
            if(op==1){
                int i=1;
                while (rs.next()) {   
                    System.out.println("["+i+"] => "+rs.getString("nome_autor")+"  "+rs.getString("nac_autor"));
                    i++;
                }
            }else{
                while (rs.next()) {
                    System.out.println(rs.getString("nome_autor")+"  "+rs.getString("nac_autor"));
                }
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    //Contar autor-----------------------------------------------------
    public static Integer ContarAutores(){
        int i=0;
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM autor");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                i++;
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return i;
    }
    //Selecionar autor
    public static Autor SelecionarAutor(int id){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT id_autor, nome_autor, nac_autor FROM biblioteca.autor WHERE id="+id);
            ResultSet rs = ps.executeQuery();
            Autor autor = new Autor(
                rs.getInt("id_autor"),
                rs.getString("nome_autor"),
                rs.getString("nac_autor")
            );
            connManager.close();           
            return autor;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return null;
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
