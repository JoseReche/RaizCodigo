package programação_java.Provas.Prova2;

public class MidiaDigital extends Midia {
    protected String album;
    
    public MidiaDigital(String album,String titulo, Boolean disponivel) {
        super(titulo, disponivel);
        this.album = album;       
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    public String toString() {
        return "Album: " + this.album 
            + ". Titulo: " + this.titulo 
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }
}
