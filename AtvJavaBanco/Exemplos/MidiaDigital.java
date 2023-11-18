public class MidiaDigital extends Midia {
    private String album;

   //private static ArrayList<MidiaDigital> midiasDigitais = new ArrayList<>();

    public MidiaDigital(String titulo, String album, boolean disponivel) {
        super(titulo, disponivel);
        this.album = album;

        Conexao.InserirMidiaDigital(this);
    }
    public String getAlbum() {
        return this.album;
    }
    public String toString() {
        return "Título: " + super.getTitulo()
            + ". Álbum: " + this.album
            + ". Disponível: " + (super.getDisponivel() ? "Sim" : "Não");
    }

}
