package br.com.view;

import javax.swing.*;

/**
 * Created by guilh on 05/07/2017.
 */
public class InicioView extends JFrame{
    private JPanel rootPanel;
    private JButton cadastrarJogadoresButton;
    private JButton buscarJogadoresButton;
    private JButton listarJogadoresButton;
    private JButton removerJogadorButton;
    private JTabbedPane tabbedPane1;
    private JButton addCashButton;
    private JList listCash;
    private JButton removeCashButton;
    private JList listAviso;
    private JButton addAvisoButton;
    private JButton removeAvisoButton;
    private JButton addTorneioButton;
    private JButton removeTorneioButton;
    private JList listTorneio;


    public InicioView(){
        pack();
        setContentPane(rootPanel);
        setTitle("Queen's Poker Club");
        setSize(600,350);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }



    public static void main(String[] args) {
        new InicioView();
    }
}
