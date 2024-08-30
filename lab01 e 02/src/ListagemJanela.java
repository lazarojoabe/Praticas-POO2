import javax.swing.*;
import java.awt.*;
import java.util.List;
public class ListagemJanela extends JPanel {
    private JTextArea listTA;

    public ListagemJanela(GerenciadorBiblioteca biblioteca) {
        setLayout(new BorderLayout());

        listTA = new JTextArea();
        listTA.setFont(new Font("Arial", Font.BOLD, 20));
        JScrollPane scrollPane = new JScrollPane(listTA);

        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(e -> biblioteca.showLivro());

        add(scrollPane, BorderLayout.CENTER);
        add(btnVoltar, BorderLayout.SOUTH);
    }

    public void atualizarListagem(List<Livro> livros, List<Revista> revistas, List<Video> videos) {

        listTA.setText("");
        StringBuilder sb = new StringBuilder();

        for (Livro livro : livros) {
            sb.append(livro.toString()).append("\n");
        }


        for (Revista revista : revistas) {
            sb.append(revista.toString()).append("\n");
        }

        for (Video video : videos) {
            sb.append(video.toString()).append("\n");
        }

        listTA.setText(sb.toString());
    }

}
