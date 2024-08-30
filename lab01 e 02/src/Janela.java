import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public abstract class Janela<T> extends JPanel {
    private JTextField tituloTF;
    private JTextField anoTF;
    protected List<T> itens;
    private GerenciadorBiblioteca biblioteca;
    private JPanel panelButtons;
    private JPanel panelCampos;
    protected Font fonteAtualizada;

    public Janela(GerenciadorBiblioteca biblioteca) {
        itens = new ArrayList<T>();
        this.biblioteca = biblioteca;

        fonteAtualizada = new Font("Arial", Font.BOLD, 20);

        this.panelButtons = new JPanel();
        this.panelButtons.setLayout(new GridLayout(1, 3));


        this.panelCampos = new JPanel();
        this.panelCampos.setLayout(new GridLayout(0, 2));

        tituloTF = new JTextField(25);
        tituloTF.setFont(fonteAtualizada);
        anoTF = new JTextField(10);
        anoTF.setFont(fonteAtualizada);

        panelCampos.add(new JLabel("Título:")).setFont(fonteAtualizada);
        panelCampos.add(tituloTF);
        panelCampos.add(new JLabel("Ano:")).setFont(fonteAtualizada);
        panelCampos.add(anoTF);

        setLayout(new BorderLayout());
        add(panelButtons, BorderLayout.SOUTH);
        add(panelCampos, BorderLayout.CENTER);
    }

    protected void adicionarBotao(String texto, ActionListener listener) {
        JButton button = new JButton(texto);
        button.addActionListener(listener);
        panelButtons.add(button);
    }

    protected void adicionarCampoEspecifico(JLabel label, JTextField textField) {
        label.setFont(fonteAtualizada);
        textField.setFont(fonteAtualizada);
        panelCampos.add(label);
        panelCampos.add(textField);
    }

    protected abstract void incluirItem();

    protected abstract List<T> getItens();

    public JTextField getTituloTF() {
        return tituloTF;
    }

    public JTextField getAnoTF() {
        return anoTF;
    }

    public GerenciadorBiblioteca getBiblioteca() {
        return biblioteca;
    }

}
