package br.com.control;

import br.com.model.dao.FachadaDAO;
import br.com.model.pojo.Jogador;
import br.com.model.vo.AvisoVO;
import br.com.view.NovoAvisoView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class NovoAvisoControl implements ActionListener {
    private NovoAvisoView view;
    private Jogador jogador;
    public NovoAvisoControl(NovoAvisoView view, Jogador jogador) {
        this.view = view;
        this.jogador = jogador;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        AvisoVO aviso = new AvisoVO();
        try {
            aviso.setMensagem(view.getMensagemArea().getText());
            aviso.setAutor(jogador.getNome());
            FachadaDAO.novoAviso(aviso);
            JOptionPane.showMessageDialog(null, "Aviso enviado.");
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar aviso.");
            e1.printStackTrace();
        }
        view.dispose();
    }
}
