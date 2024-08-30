import javax.swing.*;
import java.awt.*;

public class GerenciadorBiblioteca extends JFrame{

    private LivroJanela livroJanela;
    private RevistaJanela revistaJanela;
    private ListagemJanela listagemJanela;
    private VideoJanela videoJanela;

    public GerenciadorBiblioteca() {
        setTitle("Gerenciador de biblioteca");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        livroJanela = new LivroJanela(this);
        revistaJanela = new RevistaJanela(this);
        listagemJanela = new ListagemJanela(this);
        videoJanela = new VideoJanela(this);

        setContentPane(livroJanela);
    }

    public void showLivro() {
        setContentPane(livroJanela);
        revalidate();
    }

    public void showRevista() {
        setContentPane(revistaJanela);
        revalidate();
    }

    public void showVideo() {
        setContentPane(videoJanela);
        revalidate();
    }
    public void showLista() {
        listagemJanela.atualizarListagem(livroJanela.getItens(), revistaJanela.getItens(), videoJanela.getItens());
        setContentPane(listagemJanela);
        revalidate();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GerenciadorBiblioteca().setVisible(true);
            }
        });
    }

}
