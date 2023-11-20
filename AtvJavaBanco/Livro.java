public class Livro extends Midia {
    private Integer idAutor;

    public Livro(int id, String titulo, Integer idAutor, Integer disponivel) {
        super(id, titulo, disponivel);
        this.idAutor = idAutor;
    }

    public Livro(String titulo, Integer idAutor, Integer disponivel) {
        super(titulo, disponivel);
        this.idAutor = idAutor;
        Conexao.InserirLivro(this);
    }

    /*public String toString() {
        return "Título: " + super.getTitulo()
            + ". Autor: " + this.idAutor.getNome() 
            + ". Disponível: " + (super.getDisponivel() ? "Sim" : "Não");
    }*/

    public void setidAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public Integer getidAutor() {
        return this.idAutor;
    }


    /*public static void listarLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).toString());
        }
    }*/

    /*public static void listarLivrosPorAutor(Autor autor) {
        for(int i = 0; i < livros.size(); i++) {
            if (livros.get(i).autor == autor) {
                System.out.println(i + " - " + livros.get(i).toString());
            }
        }
    }*/
}
