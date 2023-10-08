package programação_java.Provas.Prova2;

import java.util.Scanner;
/*
Para analisar o aprendizado, você foi designado para desenvolver um sistema de gerenciamento de biblioteca em Java. 
O sistema deve ser capaz de lidar com entidades como Livro, Autor e Biblioteca, 
e deve permitir a adição de livros à biblioteca, empréstimo de livros a usuários e devolução de livros.

Crie uma classe principal para testar seu programa.

No método main da classe principal, deverão ser descannerritas as seguintes operações:
- Criar autor
- Criar livro
- Criar biblioteca
- Adicionar livro à biblioteca
- Emprestar livro
- Devolver livro

Certifique-se de que seu programa seja capaz de lidar com casos em que um livro já está 
emprestado e tentativas de devolução de livros que já estão disponíveis.

Observações:

Implemente as classes com cuidado, seguindo as especificações fornecidas.
Utilize a classe Biblioteca para gerenciar os livros e suas operações relacionadas.
Certifique-se de que o sistema de gerenciamento de biblioteca funcione conforme o esperado
e apresente resultados claros das operações realizadas.*/

public class Sistema {
    // Códigos ANSI para cores
    public static String vermelho = "\u001B[31m";
    public static String verde = "\u001B[32m";
    public static String roxo = "\u001B[34m";
    public static String reset = "\u001B[0m";
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int op = 0;

        do {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║"+roxo+"         BIBLÍOTECA MUNICIPAL         "+reset+"║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║ [1] - Criar autor                    ║");
            System.out.println("║ [2] - Criar livro                    ║");
            System.out.println("║ [3] - Criar biblioteca               ║");
            System.out.println("║ [4] - Adicionar livro                ║");
            System.out.println("║ [5] - Emprestar livro                ║");
            System.out.println("║ [6] - Devolver livro                 ║");
            System.out.println("║"+vermelho + " [0] - Sair                           " + reset+"║");
            System.out.println("╚══════════════════════════════════════╝");
            op = ValidInt("Escolha uma função",scanner);
            switch (op) {
                case 0: {
                    System.out.println(vermelho+"Sair...."+reset);
                    break;
                }
                case 1: {
                    CriarAutor(scanner);
                    break;
                }
                case 2: {
                    CriarLivro(scanner);
                    break;
                }
                case 3: {
                    System.out.println("╔══════════════════════════════════════╗");
                    System.out.println("║"+roxo+"          CRIAR BIBLIOTECA            "+reset+"║");
                    System.out.println("╚══════════════════════════════════════╝");
                    String nomeBiblioteca = ValidString("Digite o nome da biblioteca",scanner);
                    new Biblioteca(nomeBiblioteca);
                    break;
                }
                case 4: {
                    System.out.println("╔══════════════════════════════════════╗");
                    System.out.println("║"+roxo+"          ADICIONAR LIVRO             "+reset+"║");
                    System.out.println("╚══════════════════════════════════════╝");
                    int posicaoBiblioteca = -1;
                    do {
                        if(Biblioteca.bibliotecas.size()<1){
                            System.out.println("╔══════════════════════════════════════╗");
                            System.out.println("║"+roxo+"          CRIAR BIBLIOTECA            "+reset+"║");
                            System.out.println("╚══════════════════════════════════════╝");
                            String nomeBiblioteca = ValidString("Digite o nome da biblioteca",scanner);
                            new Biblioteca(nomeBiblioteca);
                        }
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = ValidInt("Escolha uma Biblioteca",scanner);
                            if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println(e);
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    do {
                        if (Livro.livros.size()<1){
                            
                        }
                        Livro.listarLivros();
                        try {
                            posicaoLivro = scanner.nextInt();
                            if (posicaoLivro >= Livro.livros.size()) {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    Livro livro = Livro.livros.get(posicaoLivro);

                    biblioteca.adicionarLivro(livro);
                    break;
                }
                case 5: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    do {
                        biblioteca.listarLivros();
                        try {
                            posicaoLivro = scanner.nextInt();
                            if (posicaoLivro >= Livro.livros.size()) {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    Livro livro = biblioteca.livros.get(posicaoLivro);
                    try {
                        livro.emprestar();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                } case 6: {
                    int posicaoBiblioteca = -1;
                    do {
                        Biblioteca.listarBibliotecas();
                        try {
                            posicaoBiblioteca = scanner.nextInt();
                            if (posicaoBiblioteca >= Biblioteca.bibliotecas.size()) {
                                throw new Exception("Biblioteca inválida");
                            }
                        } catch (Exception e) {
                            System.out.println("Biblioteca inválida");
                            posicaoBiblioteca = -1;
                        }
                    } while (posicaoBiblioteca < 0);

                    Biblioteca biblioteca = Biblioteca.bibliotecas.get(posicaoBiblioteca);

                    int posicaoLivro = -1;
                    do {
                        biblioteca.listarLivros();
                        try {
                            posicaoLivro = scanner.nextInt();
                            if (posicaoLivro >= Livro.livros.size()) {
                                throw new Exception("Livro inválido");
                            }
                        } catch (Exception e) {
                            System.out.println("Livro inválido");
                            posicaoLivro = -1;
                        }
                    } while (posicaoLivro < 0);

                    Livro livro = biblioteca.livros.get(posicaoLivro);
                    try {
                        livro.devolver();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                default: {
                    System.out.println(vermelho+"Opção inválida"+reset);
                    break;
                }
            }
        } while (op != 0);
        scanner.close();
    }
    public static void CriarAutor(Scanner scanner){
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+roxo+"             CRIAR AUTOR              "+reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        String nome = ValidString("Digite o nome do Autor",scanner);
        new Autor(nome);
    }
    public static void CriarLivro(Scanner scanner){
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+roxo+"             CRIAR LIVRO              "+reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        String titulo = ValidString("Digite o Título",scanner);
        int posicaoAutor = -1;
        do {
            if(Autor.autores.size()<1){
                System.out.println("╔══════════════════════════════════════╗");
                System.out.println("║"+roxo+"             CRIAR AUTOR              "+reset+"║");
                System.out.println("╚══════════════════════════════════════╝");
                String nome = ValidString("Digite o nome do Autor",scanner);
                new Autor(nome);
            }
            Autor.listarAutores();
            try {
                posicaoAutor = ValidInt("Escolha o autor",scanner);
                if (posicaoAutor >= Autor.autores.size()) {
                    throw new Exception(vermelho+"Autor inválido. Digite novamente"+reset);
                }
            } catch (Exception e) {
                System.out.println(e);
                posicaoAutor = -1;
            }
        } while (posicaoAutor < 0);
        Autor autor = Autor.autores.get(posicaoAutor);
        new Livro(titulo, autor, true);
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
    public static void Seta(){
        System.out.print("=>  ");
    }
}
