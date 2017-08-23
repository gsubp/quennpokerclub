package br.com.view;

import br.com.control.InicioViewControl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InicioView extends JFrame{
    private JTabbedPane tabbedPane1;
    private JButton novoAvisoButton;
    private JTextArea avisoArea;
    private JTable classificacaoTable;
    private JTable cashTable;
    private JTable torneioTable;
    private JButton relatoriosButton;
    private JButton opçõesButton;
    private JPanel rootPanel;
    private JTextField loginField;
    private JPasswordField senhaField;
    private JButton cancelarButton;
    private JButton logarButton;
    private JPanel loginPanel;
    private JButton sairButton;

    public InicioView(){
        pack();
        setContentPane(rootPanel);
        setTitle("Queen's Poker Club");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
            Definir model das tabelas
        */
        DefaultTableModel torneioModel = new DefaultTableModel();
        torneioModel.addColumn("ID");
        torneioModel.addColumn("Título");
        torneioModel.addColumn("Buy-in");
        torneioModel.addColumn("Rebuy");
        torneioModel.addColumn("Addon");
        torneioModel.addColumn("Estrutura");
        torneioModel.addColumn("Horário de Início");
        torneioModel.addColumn("Jogadores Inscritos");
        torneioTable.setModel(torneioModel);

        DefaultTableModel cashModel = new DefaultTableModel();
        cashModel.addColumn("ID");
        cashModel.addColumn("Título");
        cashModel.addColumn("Buy-in");
        cashModel.addColumn("Blinds");
        cashModel.addColumn("Tipo de Jogo");
        cashModel.addColumn("Tamanho da mesa");
        cashModel.addColumn("Jogadores Sentados");
        cashTable.setModel(cashModel);

        DefaultTableModel classficacaoModel = new DefaultTableModel();
        classficacaoModel.addColumn("Colocação");
        classficacaoModel.addColumn("Jogador");
        classficacaoModel.addColumn("Pontos");
        classificacaoTable.setModel(classficacaoModel);

        sairButton.addActionListener(new InicioViewControl(this));

        setVisible(true);

    }

    public JButton getNovoAvisoButton() {
        return novoAvisoButton;
    }

    public JTextArea getAvisoArea() {
        return avisoArea;
    }

    public JTable getClassificacaoTable() {
        return classificacaoTable;
    }

    public JTable getCashTable() {
        return cashTable;
    }

    public JTable getTorneioTable() {
        return torneioTable;
    }

    public JButton getRelatoriosButton() {
        return relatoriosButton;
    }

    public JButton getOpçõesButton() {
        return opçõesButton;
    }

    public JButton getSairButton() {
        return sairButton;
    }

    public JButton getLogarButton() {
        return logarButton;
    }

    public JTextField getLoginField() {
        return loginField;
    }

    public JPasswordField getSenhaField() {
        return senhaField;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public static void main(String[] args) {
        new InicioView();
    }
}
