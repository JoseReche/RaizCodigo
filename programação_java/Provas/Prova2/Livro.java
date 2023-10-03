package programação_java.Provas.Prova2;

import java.util.ArrayList;

public class Livro {
    /*Livro: Esta classe deve representar um livro na biblioteca e deve conter atributos como titulo, 
        autor e disponivel. Ela deve ter um construtor para inicializar o título e o autor do livro, 
        bem como métodos para emprestar e devolver um livro, alterando o estado de disponibilidade. 
        Também deve conter um método toString para representar a classe como uma string. */
    public String titulo;
    public Autor autor;
    public boolean disponivel;

    public static ArrayList<Livro> livros = new ArrayList<Livro>();

    public Livro(String titulo, Autor autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
        
        livros.add(this);
    }
}
