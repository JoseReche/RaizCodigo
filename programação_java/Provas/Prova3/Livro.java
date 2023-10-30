package programação_java.Provas.Prova3;

import java.util.ArrayList;

public class Livro extends Midia {
    public static String verde = "\u001B[32m";
    public static String reset = "\u001B[0m";

    protected Autor autor;
    public static ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String titulo, Autor autor, boolean disponivel) {
        super (titulo, disponivel);
        this.autor = autor;

        livros.add(this);
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
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

   
}
