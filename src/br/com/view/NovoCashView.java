package br.com.view;

import br.com.control.NovoCashControl;

import javax.swing.*;

public class NovoCashView extends JFrame{
    private JPanel rootPanel;
    private JTextField tituloField;
    private JSpinner buyinSpinner;
    private JTextField blindsField;
    private JRadioButton sixRadioButton;
    private JRadioButton nineLugaresRadioButton;
    private JComboBox tipoCombo;
    private JButton salvarButton;

    public NovoCashView(){
        pack();
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400,225);

        salvarButton.addActionListener(new NovoCashControl(this));
        setVisible(true);
    }

    public JTextField getTituloField() {
        return tituloField;
    }

    public JSpinner getBuyinSpinner() {
        return buyinSpinner;
    }

    public JTextField getBlindsField() {
        return blindsField;
    }

    public JRadioButton getSixRadioButton() {
        return sixRadioButton;
    }

    public JRadioButton getNineLugaresRadioButton() {
        return nineLugaresRadioButton;
    }

    public JComboBox getTipoCombo() {
        return tipoCombo;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }
}
