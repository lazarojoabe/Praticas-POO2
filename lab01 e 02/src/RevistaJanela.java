import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class RevistaJanela extends Janela<Revista> {
    private JTextField orgTF;
    private JTextField volTF;
    private JTextField numTF;

    public RevistaJanela(GerenciadorBiblioteca biblioteca) {
        super(biblioteca);

        orgTF = new JTextField(25);
        volTF = new JTextField(10);
        numTF = new JTextField(10);

        adicionarCampoEspecifico(new JLabel("Organização:"), orgTF);
        adicionarCampoEspecifico(new JLabel("Volume:"), volTF);
        adicionarCampoEspecifico(new JLabel("Número:"), numTF);

        adicionarBotao("Incluir", e -> incluirItem());
        adicionarBotao("Listagem", e -> getBiblioteca().showLista());
        adicionarBotao("Livro", e -> getBiblioteca().showLivro());
        adicionarBotao("Video", e -> getBiblioteca().showVideo());
    }

    @Override
    protected void incluirItem() {
        String titulo = getTituloTF().getText();
        String organizacao = orgTF.getText();
        int volume = Integer.parseInt(volTF.getText());
        int numero = Integer.parseInt(numTF.getText());
        int ano = Integer.parseInt(getAnoTF().getText());
        getItens().add(new Revista(titulo, organizacao, volume, numero, ano));
        JOptionPane.showMessageDialog(null, "Revista incluída com sucesso!");
    }

    @Override
    protected List<Revista> getItens() {
        return itens;
    }
}
