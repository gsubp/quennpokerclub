package br.com.control;

import br.com.view.NovoCashView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovoCashControl implements ActionListener {
    private NovoCashView view;
    public NovoCashControl(NovoCashView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
