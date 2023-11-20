public class Pessoa {
    protected int id;
    protected String nome;

    public Pessoa(int id, String nome) {
        this(nome);
        this.id = id;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }
}
