package programação_java.Provas.Prova2;

import java.util.ArrayList;

public class Autor {
    public static String verde = "\u001B[32m";
    public static String reset = "\u001B[0m";
    public String nome;
    public static ArrayList<Autor> autores = new ArrayList<Autor>();

    public Autor(String nome) {
        this.nome = nome;

        autores.add(this);
    }

    public String toString() {
        return " => " + this.nome;
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
/*Autor: Esta classe deve representar um autor de livros e deve conter um atributo nome. 
    Ela deve ter um construtor para inicializar o nome do autor e um método toString para representar a classe como uma string. */