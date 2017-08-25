package br.com.control;

import br.com.model.dao.FachadaDAO;
import br.com.model.vo.CashGameVO;
import br.com.view.NovoCashView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovoCashControl implements ActionListener {
    private NovoCashView view;
    public NovoCashControl(NovoCashView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CashGameVO cash = new CashGameVO();
        cash.setTitulo(view.getTituloField().getText());
        cash.setBuyin(Double.parseDouble(view.getBuyinField().getText()));
        cash.setBlinds(view.getBlindsField().getText());
        cash.setTipoJogo(view.getTipoCombo().getSelectedItem().toString());
        if(view.getSixRadioButton().isSelected())
            cash.setTamanhoMesa(6);
        else
            cash.setTamanhoMesa(9);
        try {
            FachadaDAO.novoCash(cash);
            JOptionPane.showMessageDialog(null, "Cash Game criado");
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, "Erro ao cadasdtrar novo Cash Game.");
            e1.printStackTrace();
        }
        view.dispose();
    }
}
