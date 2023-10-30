package programação_java.Provas.Prova2;

import java.util.ArrayList;

public class Biblioteca {
    public static String verde = "\u001B[32m";
    public static String reset = "\u001B[0m";

    protected String nome;
    protected ArrayList<Midia> midias;
    protected static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;

        bibliotecas.add(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Midia> getMidias() {
        return midias;
    }

    public static ArrayList<Biblioteca> getBibliotecas() {
        return bibliotecas;
    }
    
    public void adicionarLivro(Livro livro) {
        this.midi as.add(livro);
    }
    
    public void listarMidias() {
        for(int i = 0; i < this.midias.size(); i++) {
            System.out.println(i + " - " + this.midias.get(i).toString());
        }
    }
    
    public String toString() {
        return " => " + this.nome;
    }
    public static void listarBibliotecas(int p1) {
        
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+verde+"             BIBLIOTECAS              "+reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        for(int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + biblioteca.toString());
            if(p1==1){
                biblioteca.listarMidias();
            }
        }
    }
}
