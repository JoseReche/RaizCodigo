package programação_java.Provas.Prova2;

import java.util.ArrayList;

public class Biblioteca {
    public static String verde = "\u001B[32m";
    public static String reset = "\u001B[0m";
    public String nome;
    public ArrayList<Livro> livros;

    public static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();

        bibliotecas.add(this);
    }

    public String toString() {
        return " => " + this.nome;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void listarLivros() {
        for(int i = 0; i < this.livros.size(); i++) {
            System.out.println(i + " - " + this.livros.get(i).toString());
        }
    }

    public static void listarBibliotecas() {
        
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+verde+"             BIBLIOTECAS              "+reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        for(int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
            biblioteca.listarLivros();
        }
    }
}
