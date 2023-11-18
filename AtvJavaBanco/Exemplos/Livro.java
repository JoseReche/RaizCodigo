public class Livro extends Midia {
    private Autor autor;

    public Livro(String titulo, Autor autor, boolean disponivel) {
        super(titulo, disponivel);
        this.autor = autor;

        livros.add(this);
    }

    public String toString() {
        return "Título: " + super.getTitulo()
            + ". Autor: " + this.autor.getNome() 
            + ". Disponível: " + (super.getDisponivel() ? "Sim" : "Não");
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public static ArrayList<Livro> getLivros() {
        return livros;
    }

    public static void listarLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).toString());
        }
    }

    public static void listarLivrosPorAutor(Autor autor) {
        for(int i = 0; i < livros.size(); i++) {
            if (livros.get(i).autor == autor) {
                System.out.println(i + " - " + livros.get(i).toString());
            }
        }
    }
}
