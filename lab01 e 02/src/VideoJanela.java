import javax.swing.*;
import java.util.List;

public class VideoJanela extends Janela<Video>{
    private JTextField diretor;
    private JTextField duracao;

    public VideoJanela(GerenciadorBiblioteca biblioteca) {
        super(biblioteca);

        diretor = new JTextField(20);
        duracao = new JTextField(10);
        adicionarCampoEspecifico(new JLabel("Diretor"), diretor);
        adicionarCampoEspecifico(new JLabel("Duracao"), duracao);

        adicionarBotao("Incluir", e -> incluirItem());
        adicionarBotao("Livros", e -> getBiblioteca().showLivro());
        adicionarBotao("Revista", e -> getBiblioteca().showRevista());
        adicionarBotao("Listagem", e -> getBiblioteca().showLista());
    }

    @Override
    protected void incluirItem() {
        String titulo = getTituloTF().getText();
        String diret = diretor.getText();
        String durac = duracao.getText();
        itens.add(new Video(titulo, diret, durac));
        JOptionPane.showMessageDialog(null, "Video incluído com sucesso!");

    }
    @Override
    protected List<Video> getItens() {
        return itens;
    }
}
