package br.com.view;

import br.com.control.TorneioControl;
import br.com.model.pojo.Jogador;
import br.com.model.pojo.Torneio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TorneioView extends JFrame{
    private JTextField buyinField;
    private JTextField rebuyField;
    private JTextField addonField;
    private JPanel rootPanel;
    private JTextArea estruturaArea;
    private JTable jogadoresTable;
    private JTextField inicioField;
    private JButton inscreverButton;
    private JLabel tituloLabel;
    private JButton cancelarInscriçãoButton;

    public TorneioView(Torneio torneio, Jogador jogador) throws Exception {
        pack();
        setContentPane(rootPanel);
        setSize(700,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        TorneioControl control = new TorneioControl(this, torneio, jogador);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Jogador");
        jogadoresTable.setModel(model);

        inscreverButton.addActionListener(control);

    }

    public JTextField getBuyinField() {
        return buyinField;
    }

    public JTextField getRebuyField() {
        return rebuyField;
    }

    public JTextField getAddonField() {
        return addonField;
    }

    public JTextArea getEstruturaArea() {
        return estruturaArea;
    }

    public JTable getJogadoresTable() {
        return jogadoresTable;
    }

    public JTextField getInicioField() {
        return inicioField;
    }

    public JButton getInscreverButton() {
        return inscreverButton;
    }

    public JLabel getTituloLabel() {
        return tituloLabel;
    }
}
