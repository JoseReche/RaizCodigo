public class Biblioteca {
    private String nome;
    private ArrayList<Livro> livros;
    private ArrayList<MidiaDigital> midiasDigitals;

    private static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.midiasDigitals = new ArrayList<>();

        bibliotecas.add(this);
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void adicionarMidiaDigital(MidiaDigital midiaDigitals) {
        this.midiasDigitals.add(midiaDigitals);
    }

    public void listarLivros() {
        for(int i = 0; i < this.livros.size(); i++) {
            System.out.println(i + " - " + this.livros.get(i).toString());
        }
    }

    public void listarMidias() {
        for(int i = 0; i < this.midiasDigitals.size(); i++) {
            System.out.println(i + " - " + this.midiasDigitals.get(i).toString());
        }
    }

    public static ArrayList<Biblioteca> getBibliotecas() {
        return bibliotecas;
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }

    public ArrayList<MidiaDigital> getMidiasDigitals() {
        return this.midiasDigitals;
    }

    public static void listarBibliotecas() {
        for(int i = 0; i < bibliotecas.size(); i++) {
            Biblioteca biblioteca = bibliotecas.get(i);
            System.out.println(i + " - " + biblioteca.toString());
        }
    }
}
