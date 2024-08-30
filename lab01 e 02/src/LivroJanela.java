import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class LivroJanela extends Janela<Livro> {
    private JTextField autorTF;

    public LivroJanela(GerenciadorBiblioteca biblioteca) {
        super(biblioteca);

        autorTF = new JTextField(25);
        adicionarCampoEspecifico(new JLabel("Autor:"), autorTF);

        adicionarBotao("Incluir", e -> incluirItem());
        adicionarBotao("Listagem", e -> getBiblioteca().showLista());
        adicionarBotao("Revista", e -> getBiblioteca().showRevista());
        adicionarBotao("Video", e -> getBiblioteca().showVideo());
    }

    @Override
    protected void incluirItem() {
        String titulo = getTituloTF().getText();
        String autor = autorTF.getText();
        String ano = getAnoTF().getText();
        getItens().add(new Livro(titulo, autor, ano));
        JOptionPane.showMessageDialog(null, "Livro incluído com sucesso!");
    }

    @Override
    protected List<Livro> getItens() {
        return itens;
    }
}
