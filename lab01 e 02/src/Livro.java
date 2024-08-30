import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private String ano;

    public Livro(String titulo, String autor, String ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + "  "+ autor + "  "+ ano ;
    }
}
