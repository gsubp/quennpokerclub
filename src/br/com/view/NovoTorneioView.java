package br.com.view;

import br.com.control.NovoTorneioControl;

import javax.swing.*;

public class NovoTorneioView extends JFrame{
    private JTextField tituloField;
    private JSpinner buyinSpinner;
    private JCheckBox reBuyCheckBox;
    private JCheckBox addOnCheckBox;
    private JFormattedTextField dataField;
    private JFormattedTextField horaField;
    private JPanel rootPanel;
    private JTextArea estruturaArea;
    private JButton salvarButton;

    public NovoTorneioView(){
        pack();
        setContentPane(rootPanel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(475,300);

        salvarButton.addActionListener(new NovoTorneioControl(this));
        setVisible(true);

    }

    public JTextField getTituloField() {
        return tituloField;
    }

    public JSpinner getBuyinSpinner() {
        return buyinSpinner;
    }

    public JCheckBox getReBuyCheckBox() {
        return reBuyCheckBox;
    }

    public JCheckBox getAddOnCheckBox() {
        return addOnCheckBox;
    }

    public JFormattedTextField getDataField() {
        return dataField;
    }

    public JFormattedTextField getHoraField() {
        return horaField;
    }

    public JTextArea getEstruturaArea() {
        return estruturaArea;
    }

    public JButton getSalvarButton() {
        return salvarButton;
    }
}
