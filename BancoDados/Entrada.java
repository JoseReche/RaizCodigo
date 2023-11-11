import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Entrada {
    // Códigos ANSI para cores
    public static String vermelho = "\u001B[31m";
    public static String verde = "\u001B[32m";
    public static String roxo = "\u001B[34m";
    public static String amarelo = "\u001B[33m";
    public static String reset = "\u001B[0m";
    
    public static void main(String[] args) {
//Conexao------------------------------------------------------------------
   /*   try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/sistema",
                    "root",
                    ""
                );
            //System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM usuario");
           // ps.setString(1, "%JA%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome_usuario")+"  "+rs.getString("email")+"  "+rs.getString("senha"));
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    */
//Conexao------------------------------------------------------------------
    Scanner scanner = new Scanner(System.in);
    int op = 0;

    do {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+roxo+"         BIBLIOTECA MUNICIPAL         "+reset+"║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ [1] - Criar Usuário                  ║");
        System.out.println("║ [2] - Alterar Usuário                ║");
        System.out.println("║ [3] - Excluir Usuário                ║");
        System.out.println("║ [4] - Visualizar Usuario             ║");
        System.out.println("║ [5] - Logar                          ║");
        System.out.println("║"+vermelho + " [0] - Sair                           " + reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        op = ValidInt("Escolha uma função",scanner);
        switch (op) {
            case 0:{
                System.out.println(vermelho+"Sair...."+reset);
                break;
            }
            case 1:{
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║"+roxo+"           CRIAR USUÁRIO              "+reset+"║");
                System.out.println("╚══════════════════════════════════════╝");
                String usuario = ValidString("Digite o seu Nome do Usuário",scanner);
                String email = ValidString("Digite o seu Email do Usuário",scanner);
                String senha = ValidString("Digite a sua Senha do Usuário",scanner);
                incerirUsuario(usuario, email, senha);

                break;
            }
            case 2:{
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║"+roxo+"           ALTERAR USUÁRIO             "+reset+"║");
                System.out.println("╚══════════════════════════════════════╝");
                selecionarUsuario();
                Integer id = ValidInt("Selecione O Usuário",scanner);
                String nome = ValidString("Digite o Novo Nome do Usuário",scanner);
                String email = ValidString("Digite o Novo Email do Usuário",scanner);
                alterarUsuario(id, email, nome);
                break;
            }
            case 3:{
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║"+roxo+"           EXCLUIR USUÁRIO        "+reset+"║");
                System.out.println("╚══════════════════════════════════════╝");
                break;
            }
            case 4:{
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║"+roxo+"           VISUALIZAR USUÁRIOS        "+reset+"║");
                System.out.println("╚══════════════════════════════════════╝");
                selecionarUsuario();
                break;
            }
            case 5:{
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║"+roxo+"           LOGAR USUÁRIO             "+reset+"║");
                System.out.println("╚══════════════════════════════════════╝");
                break;
            }
        }
    }while (op != 0);
    scanner.close();
}
//Validações ----------------------------------------------------------------
    // todo: Valida se tem numero na String---------------------------------------------------
    public static String ValidString(String txt,Scanner scanner){
        String parametro;
        char caracter;
        try {
            System.out.println(txt);
            Seta();
            parametro = scanner.next();
            for(int i=0;i<parametro.length();i++){
                caracter=parametro.charAt(i);
                if(Character.isDigit(caracter)){
                   throw new Exception(vermelho+"Digitação inválida. Favor digitar somente letras"+reset); 
                }
            }
        }catch (Exception e) {
            System.out.println(e); 
           parametro=ValidString(txt, scanner);
        }
        return parametro;
    }
    // todo: Valida se tem letra no Integer---------------------------------------------------
    public static Integer ValidInt(String txt,Scanner scanner){
        String parametro;
        char caracter;
        Integer numero;
        try {
            System.out.println(txt);
            Seta();
            parametro = scanner.next();
            for(int i=0;i<parametro.length();i++){
                caracter=parametro.charAt(i);
                if(!Character.isDigit(caracter)){
                   throw new Exception(vermelho+"Digitação inválida. Favor digitar somente Numeros"+reset); 
                }
            }
            numero = Integer.parseInt(parametro);
        }catch (Exception e) {
            System.out.println(e); 
           numero=ValidInt(txt, scanner);       
        }
        return numero;
    }
    // todo: Seta---------------------------------------------------
    public static void Seta(){
        System.out.print("=>  ");
    }
    // todo: Alterar usuario---------------------------------------------------
    public static void alterarUsuario(Integer id, String nome, String email){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/sistema",
                "root",
                ""
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
    public static void incerirUsuario(String nome, String email, String senha){
        try {
            Connection connManager = DriverManager
            .getConnection(
                "jdbc:mysql://localhost:3306/sistema",
                "root",
                ""
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
    public static void selecionarUsuario(){
        try {
            Connection connManager = DriverManager
                .getConnection(
                    "jdbc:mysql://localhost:3306/sistema",
                    "root",
                    ""
                );
            //System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("SELECT * FROM usuario");
           // ps.setString(1, "%JA%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nome_usuario")+"  "+rs.getString("email"));
            }
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }
}