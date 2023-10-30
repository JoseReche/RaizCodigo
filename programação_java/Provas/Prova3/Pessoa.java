
package programação_java.Provas.Prova3;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "Nome: " + this.nome;
    }
}
