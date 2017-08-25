package br.com.control;

import br.com.model.dao.FachadaDAO;
import br.com.model.pojo.Aviso;
import br.com.model.pojo.CashGame;
import br.com.model.pojo.Jogador;
import br.com.model.pojo.Torneio;
import br.com.view.InicioView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InicioControl implements ActionListener, Runnable{
    private static InicioView view;
    private static Jogador jogador = null;
    private static Thread thread;

    public InicioControl(InicioView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getLogarButton()){
            String login = view.getLoginField().getText();
            String senha = new String(view.getSenhaField().getPassword());
            try {
                jogador = FachadaDAO.login(login, senha);
                view.getLoginField().setText("");
                view.getLoginPanel().setVisible(false);
                view.getPerfilButton().setVisible(true);
                view.getSairButton().setVisible(true);
                if(jogador.isAdmin()){
                    view.getNovoAvisoButton().setVisible(true);
                    view.getNovoCashGameButton().setVisible(true);
                    view.getNovoTorneioButton().setVisible(true);
                    view.getExcluirCashGameButton().setVisible(true);
                    view.getExcluirTorneioButton().setVisible(true);
                }
                thread = new Thread(this);
                thread.start();
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null,"Erro ao logar");
            }

        }
        if(e.getSource() == view.getCancelarButton()){
            view.getLoginPanel().setVisible(false);
            view.getLoginButton().setVisible(true);
        }
        if(e.getSource() == view.getLoginButton()){
            view.getLoginPanel().setVisible(true);
            view.getLoginButton().setVisible(false);
        }
        if(e.getSource() == view.getSairButton()){
            jogador = null;
            view.getSairButton().setVisible(false);
            view.getPerfilButton().setVisible(false);
            view.getLoginButton().setVisible(true);
            view.getNovoAvisoButton().setVisible(false);
            view.getNovoCashGameButton().setVisible(false);
            view.getNovoTorneioButton().setVisible(false);
            view.getExcluirCashGameButton().setVisible(false);
            view.getExcluirTorneioButton().setVisible(false);
            thread.stop();
        }

    }

    public static void updateAvisos(){
        try {
            List<Aviso> avisos = new ArrayList<>(FachadaDAO.listAviso());
            view.getAvisoArea().setText("");
            Iterator<Aviso> it = avisos.iterator();
            while (it.hasNext()) {
                Aviso aviso = it.next();
                view.getAvisoArea().setText(view.getAvisoArea().getText() + "Data: " +aviso.getData() + "\n"+
                        "Mensagem: " + aviso.getMensagem() + "\n" + "Autor: " + aviso.getAutor() + "\n\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateTorneiosTable(){
        try {
            List<Torneio> torneios = new ArrayList<>(FachadaDAO.listTorneio());
            DefaultTableModel model = (DefaultTableModel) view.getTorneioTable().getModel();
            model.setRowCount(0);
            Iterator<Torneio> it = torneios.iterator();
            while(it.hasNext()){
                Torneio torneio = it.next();
                model.addRow(new Object[]{torneio.getId(), torneio.getTitulo(), torneio.getBuyin(), torneio.isRebuy(),
                        torneio.isAddon(), torneio.getEstrutura(), torneio.getInicio()});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateCashGamesTable(){
        try {
            List<CashGame> cashGames = new ArrayList<>(FachadaDAO.listCashGame());
            DefaultTableModel model = (DefaultTableModel) view.getCashTable().getModel();
            model.setRowCount(0);
            Iterator<CashGame> it = cashGames.iterator();
            while(it.hasNext()){
                CashGame cash = it.next();
                model.addRow(new Object[]{cash.getId(), cash.getTitulo(), cash.getBuyin(), cash.getBlinds(),
                        cash.getTipoJogo(), cash.getTamanhoMesa()});
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateClassificacaoTable(){
        try {
            List<Jogador> classificacao = new ArrayList<>(FachadaDAO.listClassificacao());
            DefaultTableModel model = (DefaultTableModel) view.getClassificacaoTable().getModel();
            model.setRowCount(0);
            Iterator<Jogador> it = classificacao.iterator();
            int i = 1;
            while(it.hasNext()){
                Jogador jogador = it.next();
                model.addRow(new Object[]{i+"º Lugar", jogador.getNome(), jogador.getPontos()});
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                updateAvisos();
                updateTorneiosTable();
                updateCashGamesTable();
                updateClassificacaoTable();
                System.out.println("thread");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
