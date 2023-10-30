package programação_java.Provas.Prova2;

import java.util.ArrayList;

public class Autor extends Pessoa {
    protected String nacionalidade;
    protected static ArrayList<Autor> autores = new ArrayList<Autor>();
    
    public static String verde = "\u001B[32m";
    public static String reset = "\u001B[0m";

    public Autor(String nome, String nacionalidade) {
        super (nome);
        this.nacionalidade = nacionalidade;

        autores.add(this); 
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public static ArrayList<Autor> getAutores() {
        return autores;
    }

    public String toString() {
        return " Nome: " + this.nome + " Nacionalidade: "+ this.nacionalidade;
    }

    public static void listarAutores() {
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║"+verde+"               AUTORES                "+reset+"║");
        System.out.println("╚══════════════════════════════════════╝");
        for(int i = 0; i < autores.size(); i++) {
            System.out.println(i + autores.get(i).toString());
        }
    }
}
