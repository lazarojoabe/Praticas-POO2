public class Video {
    private String titulo;
    private String diretor;
    private String duracao;

    public Video(String titulo, String diretor, String duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }


    @Override
    public String toString() {
        return "Video: " + titulo + "  "+ diretor + "  " + " " + duracao + "  ";
    }
}
