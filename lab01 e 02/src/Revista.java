public class Revista {
    private String titulo;
    private String org;
    private int vol;
    private int num;
    private int ano;

    public Revista(String titulo, String org, int vol, int num, int ano) {
        this.titulo = titulo;
        this.org = org;
        this.vol = vol;
        this.num = num;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Revista: " + titulo+ "  " + org + "  " + "  "+ vol + "  "+ num + "  "+ ano ;
    }
}