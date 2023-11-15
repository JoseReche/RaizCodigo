import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    // Códigos ANSI para cores
    public static String vermelho = "\u001B[31m";
    public static String verde = "\u001B[32m";
    public static String roxo = "\u001B[34m";
    public static String amarelo = "\u001B[33m";
    public static String reset = "\u001B[0m";
    
    public static void main(String[] args) {
        Conexao conexao = new Conexao("sistema", "root","");
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
                    conexao.InserirUsuario(usuario, email, senha);
                    break;
                }
                case 2:{
                    System.out.println("╔══════════════════════════════════════╗");
                    System.out.println("║"+roxo+"           ALTERAR USUÁRIO             "+reset+"║");
                    System.out.println("╚══════════════════════════════════════╝");
                    conexao.SelecionarUsuario(0);
                    Integer id = ValidInt("Selecione O Usuário",scanner);
                    String nome = ValidString("Digite o Novo Nome do Usuário",scanner);
                    String email = ValidString("Digite o Novo Email do Usuário",scanner);
                    conexao.AlterarUsuario(id, email, nome);
                    break;
                }
                case 3:{
                    int op2;
                    do{
                        System.out.println("╔══════════════════════════════════════╗");
                        System.out.println("║"+roxo+"           EXCLUIR USUÁRIO            "+reset+"║");
                        System.out.println("╚══════════════════════════════════════╝");
                        conexao.SelecionarUsuario(1);
                        Integer id = ValidInt("Selecione O Usuário para Excluir",scanner);
                        System.out.print("Você escolheu o usuario: ");
                        conexao.SelecionarUsuarioExpecifico(id);
                        op2 = ValidInt("Deseja Exclui-lo permanentemente [1] - Sim [2] - Não", scanner);
                        switch (op2) {
                            case 1:{
                                conexao.ExcluirUsuarioExpecifico(id);
                                break;
                            }
                            default:
                                op2 = ValidInt("Deseja Continuar [1] - Sim [0] - Não", scanner);
                                break;
                        }
                    }while(op2 != 0);
                    break;
                }
                case 4:{
                    System.out.println("╔══════════════════════════════════════╗");
                    System.out.println("║"+roxo+"           VISUALIZAR USUÁRIOS        "+reset+"║");
                    System.out.println("╚══════════════════════════════════════╝");
                    conexao.SelecionarUsuario(0);
                    break;
                }
                case 5:{
                    ArrayList<String> usuarios = new ArrayList<String>();
                    System.out.println("╔══════════════════════════════════════╗");
                    System.out.println("║"+roxo+"           LOGAR USUÁRIO              "+reset+"║");
                    System.out.println("╚══════════════════════════════════════╝");
                    conexao.LogarUsuarioExpecifico(usuarios);
                    String login = ValidString("Digite o Login: ", scanner);
                    System.out.print("Digite a senha: ");
                    String senha = scanner.next();
                    for(String usuario : usuarios){
                       if (usuario.equals(login+senha)){
                        System.out.println(" logado ");
                       }
                    }
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
}