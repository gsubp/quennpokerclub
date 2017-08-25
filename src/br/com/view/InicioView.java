package br.com.view;

import br.com.control.InicioControl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InicioView extends JFrame{
    private final JMenuItem ver_torneioItem;
    private final JMenuItem inscrever_torneioItem;
    private JButton novoAvisoButton;
    private JTextArea avisoArea;
    private JTable classificacaoTable;
    private JTable cashTable;
    private JTable torneioTable;
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
    private JButton novoTorneioButton;
    private JButton novoCashGameButton;

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

        JPopupMenu torneioMenu = new JPopupMenu();
        ver_torneioItem = new JMenuItem("Ver Torneio");
        inscrever_torneioItem = new JMenuItem("Inscrever-se");
        torneioMenu.add(ver_torneioItem);
        torneioMenu.add(inscrever_torneioItem);

        sairButton.addActionListener(control);
        logarButton.addActionListener(control);
        loginButton.addActionListener(control);
        cancelarButton.addActionListener(control);
        novoPorAquiButton.addActionListener(control);
        novoAvisoButton.addActionListener(control);
        novoCashGameButton.addActionListener(control);
        novoTorneioButton.addActionListener(control);
        ver_torneioItem.addActionListener(control);
        inscrever_torneioItem.addActionListener(control);

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

    public JButton getNovoTorneioButton() {
        return novoTorneioButton;
    }

    public JButton getNovoCashGameButton() {
        return novoCashGameButton;
    }

    public JMenuItem getVer_torneioItem() {
        return ver_torneioItem;
    }

    public JMenuItem getInscrever_torneioItem() {
        return inscrever_torneioItem;
    }
}
