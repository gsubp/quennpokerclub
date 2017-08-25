package br.com.view;

import br.com.control.InicioControl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InicioView extends JFrame{
    private JButton novoAvisoButton;
    private JTextArea avisoArea;
    private JTable classificacaoTable;
    private JTable cashTable;
    private JTable torneioTable;
    private JButton relatoriosButton;
    private JButton perfilButton;
    private JPanel rootPanel;
    private JTextField loginField;
    private JPasswordField senhaField;
    private JButton cancelarButton;
    private JButton logarButton;
    private JPanel loginPanel;
    private JButton sairButton;
    private JButton novoPorAquiButton;
    private JButton loginButton;
    private JButton novoAvisoButton1;
    private JButton novoTorneioButton;
    private JButton excluirTorneioButton;
    private JButton novoCashGameButton;
    private JButton excluirCashGameButton;

    public InicioView(){
        pack();
        setContentPane(rootPanel);
        setTitle("Queen's Poker Club");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        InicioControl control = new InicioControl(this);

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
        torneioTable.setModel(torneioModel);

        DefaultTableModel cashModel = new DefaultTableModel();
        cashModel.addColumn("ID");
        cashModel.addColumn("Título");
        cashModel.addColumn("Buy-in");
        cashModel.addColumn("Blinds");
        cashModel.addColumn("Tipo de Jogo");
        cashModel.addColumn("Tamanho da mesa");
        cashTable.setModel(cashModel);

        DefaultTableModel classficacaoModel = new DefaultTableModel();
        classficacaoModel.addColumn("Colocação");
        classficacaoModel.addColumn("Jogador");
        classficacaoModel.addColumn("Pontos");
        classificacaoTable.setModel(classficacaoModel);

        sairButton.addActionListener(control);
        logarButton.addActionListener(control);
        loginButton.addActionListener(control);
        cancelarButton.addActionListener(control);

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

    public JButton getPerfilButton() {
        return perfilButton;
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

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public JButton getNovoPorAquiButton() {
        return novoPorAquiButton;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getNovoAvisoButton1() {
        return novoAvisoButton1;
    }

    public JButton getNovoTorneioButton() {
        return novoTorneioButton;
    }

    public JButton getExcluirTorneioButton() {
        return excluirTorneioButton;
    }

    public JButton getNovoCashGameButton() {
        return novoCashGameButton;
    }

    public JButton getExcluirCashGameButton() {
        return excluirCashGameButton;
    }
}
