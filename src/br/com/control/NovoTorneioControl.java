package br.com.control;

import br.com.model.dao.FachadaDAO;
import br.com.model.vo.TorneioVO;
import br.com.view.NovoTorneioView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class NovoTorneioControl implements ActionListener {
    private NovoTorneioView view;
    public NovoTorneioControl(NovoTorneioView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TorneioVO torneio = new TorneioVO();
        torneio.setTitulo(view.getTituloField().getText());
        torneio.setBuyin(Double.parseDouble(view.getBuyinField().getText()));
        torneio.setRebuy(view.getReBuyCheckBox().isSelected());
        torneio.setAddon(view.getAddOnCheckBox().isSelected());
        torneio.setEstrutura(view.getEstruturaArea().getText());
        torneio.setInicio(view.getDataField().getText() + " " + view.getHoraField().getText());
        try {
            FachadaDAO.novoTorneio(torneio);
            JOptionPane.showMessageDialog(null, "Torneio criado");
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "Erro ao criar novo torneio.");
            e1.printStackTrace();
        }
        view.dispose();
    }
}
