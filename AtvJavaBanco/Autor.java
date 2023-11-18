public class Autor extends Pessoa {
    private String nacionalidade;
    //private static ArrayList<Autor> autores = new ArrayList<Autor>();

    public Autor(int id, String nome, String nacionalidade) {
        super(id, nome);
        this.nacionalidade = nacionalidade;        
    }
    
    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        Conexao.InserirAutor(this);
        //autores.add(this);
    }

    public Autor(String nome) {
        this(nome, "Brasil");
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }
   

    /*public String toString() {
        return super.toString() + ". Nacionalidade: " + this.nacionalidade;
    }*/

    /*public static void listarAutores() {
        for(int i = 0; i < autores.size(); i++) {
            System.out.println(i + " - " + autores.get(i).toString());
        }
    }*/
}