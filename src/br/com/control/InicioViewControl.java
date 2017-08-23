package br.com.control;

import br.com.view.InicioView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioViewControl implements ActionListener {
    private InicioView view;
    public InicioViewControl(InicioView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == view.getSairButton()){}
        if(e.getSource() == view.getLogarButton()){}
        if(e.getSource() == view.getCancelarButton()){}

    }
}
