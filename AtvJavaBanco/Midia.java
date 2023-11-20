public class Midia {

    protected int id;
    protected String titulo;
    protected Integer disponivel;

    public Midia(int id, String titulo, Integer disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.id = id;
    }

    public Midia(String titulo, Integer disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDisponivel(Integer disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Integer getDisponivel() {
        return this.disponivel;
    }

    public String toString() {
        String disp="";
        if (this.disponivel != 0) {
            disp = "Não";
        }else{
            disp = "Sim";
        }
        return "Título: " + this.titulo + ". Disponível: " + disp;
    }

    public void emprestar() throws Exception {
        if (this.disponivel==1) {
            throw new Exception("Midia não está disponível");
        }
        this.disponivel = 1;
    }

    public void devolver() throws Exception {
        if (this.disponivel==0) {
            throw new Exception("Midia já está disponível");
        }
        this.disponivel = 0;
    }

}
