package br.com;

import br.com.view.InicioView;
import br.com.view.TorneioView;

public class App {
    public static void main(String[] args) throws Exception {
        new InicioView();
        new TorneioView(null,null);
    }
}