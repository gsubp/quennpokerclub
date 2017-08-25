package br.com.view;

import br.com.control.NovoAvisoControl;
import br.com.model.pojo.Jogador;

import javax.swing.*;

public class NovoAvisoView extends JFrame{
    private JPanel rootPanel;
    private JTextArea mensagemArea;
    private JButton enviarButton;

    public NovoAvisoView(Jogador jogador){
        pack();;
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(300,150);

        enviarButton.addActionListener(new NovoAvisoControl(this, jogador));
        setVisible(true);
    }

    public JTextArea getMensagemArea() {
        return mensagemArea;
    }

    public JButton getEnviarButton() {
        return enviarButton;
    }
}
