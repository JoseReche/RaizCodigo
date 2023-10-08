package programação_java.Provas.Prova2;

import java.util.ArrayList;

public class Livro {
    public static String verde = "\u001B[32m";
    public static String reset = "\u001B[0m";
    public String titulo;
    public Autor autor;
    public boolean disponivel;

    public static ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String titulo, Autor autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;

        livros.add(this);
    }

    public String toString() {
        return "Título: " + this.titulo 
            + ". Autor: " + this.autor.nome 
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

    public static void listarLivros() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+verde+"               LIVROS                 "+reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).toString());
        }
    }

    public void emprestar() throws Exception {
        if (!this.disponivel) {
            throw new Exception("Livro não está disponível");
        }
        this.disponivel = false;
    }

    public void devolver() throws Exception {
        if (this.disponivel) {
            throw new Exception("Livro já está disponível");
        }
        this.disponivel = true;
    }
}
