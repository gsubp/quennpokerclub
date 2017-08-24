package br.com.control;

import br.com.model.dao.FachadaDAO;
import br.com.model.pojo.Jogador;
import br.com.view.InicioView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioViewControl implements ActionListener {
    private InicioView view;
    private static Jogador jogador;
    public InicioViewControl(InicioView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getSairButton()){
            jogador = null;
        }
        if(e.getSource() == view.getLogarButton()){
            String login = view.getLoginField().getText();
            String senha = new String(view.getSenhaField().getPassword());
            try {
                jogador = FachadaDAO.login(login, senha);
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null,"Erro ao logar");
            }
            view.getLoginField().setText("");
            view.getLoginPanel().setVisible(false);
            view.getSairButton().setVisible(true);
        }
        if(e.getSource() == view.getCancelarButton()){
            view.getLoginPanel().setVisible(false);
        }

    }
}
