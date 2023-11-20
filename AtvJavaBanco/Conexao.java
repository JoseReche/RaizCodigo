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
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
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
    //! Autor------------------------------
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
                    System.out.println("["+i+"] => "+
                    rs.getString("nome_autor")+"  "+
                    rs.getString("nac_autor"));
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
    
    //! Midia Digital-----------------------
    //Inserir Midia Digital-----------------------------------------------------
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
                statement.setInt(2, midiaDigital.getDisponivel());
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
    //listar Midia Dogotal-----------------------------------------------------
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
    
    //! Livro-------------------------------
    //Inserir Livro-----------------------------------------------------
    public static void InserirLivro(Livro livro){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+ banco,
                usuario,
                senha
            );
            String sql = "INSERT INTO livro (titulo,disponivel,id_autor) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, livro.getTitulo());
                statement.setInt(2, livro.getDisponivel());
                statement.setInt(3, livro.getidAutor());

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Livro cadastrado com sucesso!");
                } else {
                    System.out.println("Falha ao cadastrar o Livro.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //listar Livro-----------------------------------------------------
    public static void listarLivro(int op){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM livro");
            ResultSet rs = ps.executeQuery();
            if(op==1){
                int i=1;
                while (rs.next()) {
                    System.out.println("["+i+"] => "+
                    rs.getString("titulo")+"  "+
                    rs.getString("id_autor")+"  "+
                    rs.getInt("disponivel"));
                    i++;
                }
            }else{
                while (rs.next()) {
                    System.out.println(
                    rs.getString("titulo")+"  "+
                    rs.getString("autor_id_autor")+"  "+
                    rs.getInt("disponivel"));
                }
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    //Contar Livro-----------------------------------------------------
    public static Integer ContarLivro(){
        int i=0;
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM livro");
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

    //! Biblioteca--------------------------
    //Incerir Biblioteca-----------------------------------------------------
    public static void InserirBiblioteca(Biblioteca biblioteca){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+ banco,
                usuario,
                senha
            );
            String sql = "INSERT INTO biblioteca (nome) VALUES (?)";
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setString(1, biblioteca.getNome());

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Biblioteca cadastrada com sucesso!");
                } else {
                    System.out.println("Falha ao cadastrar a Biblioteca.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //listar Biblioteca-----------------------------------------------------
    public static void listarBiblioteca(int op){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM biblioteca");
            ResultSet rs = ps.executeQuery();
            if(op==1){
                int i=1;
                while (rs.next()) {
                    System.out.println("["+i+"] => "+
                    rs.getString("nome"));
                    i++;
                }
            }else{
                while (rs.next()) {
                    System.out.println(rs.getString("nome"));
                }
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
    //Contar Biblioteca-----------------------------------------------------
    public static Integer ContarBiblioteca(){
        int i=0;
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM biblioteca");
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
    //Incerir Livro na Biblioteca-----------------------------------------------------
    public static void InserirLivroBiblioteca(int biblioteca, int livro){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/"+banco,
                usuario,
                senha
            );
            String sql = "UPDATE livro SET id_biblioteca = ? WHERE id_livro="+livro;
            try (PreparedStatement statement = connManager.prepareStatement(sql)) {
                // Define os parâmetros
                statement.setInt(1, biblioteca);

                // Executa a inserção
                int linhasAfetadas = statement.executeUpdate();

                if (linhasAfetadas > 0) {
                    System.out.println("Livro Incuido na biblioteca com sucesso!");
                } else {
                    System.out.println("Falha ao Incuir Livro na biblioteca.");
                }
            }
            connManager.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //listar Livro da Biblioteca----------------------------------------------
    public static ArrayList listarLivroBiblioteca(int op,int biblioteca){
        ArrayList<Integer> idLivros = new ArrayList<>();
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/"+banco,
                    usuario,
                    senha
                );
            PreparedStatement ps = connManager.prepareStatement("SELECT livro.id_livro, livro.titulo, biblioteca.nome as nome FROM livro JOIN biblioteca ON livro.id_biblioteca = biblioteca.id_biblioteca WHERE biblioteca.id_biblioteca ="+biblioteca);
            //ResultSet rs = ps.executeQuery(); 
            boolean temResultado = ps.execute();

                // Verificar se há um conjunto de resultados (SELECT)
                if (temResultado) {
                    do {
                        // Processar os resultados
                        ResultSet rs = ps.getResultSet();
                        while (rs.next()) {
                            System.out.println(rs.getString("titulo"));
                            //System.out.println(rs.getInt("id_livro"));
                        }
                        // Verificar se há mais conjuntos de resultados
                        temResultado = ps.getMoreResults();

                    } while (temResultado);
                }
            connManager.close();
            return idLivros;
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
            return null;
        }
    }
}
