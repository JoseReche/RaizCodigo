package programação_java.Provas.Prova2;

public class Midia {
    protected String titulo;
    protected Boolean disponivel;

    public Midia(String titulo, Boolean disponive) {
        this.titulo = titulo; 
        this.disponivel = disponive;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
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

    public String toString() {
        return "Título: " + this.titulo
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

}
