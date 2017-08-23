package br.com.model.dao.factory;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.CashGameDAO;
import br.com.model.dao.JogadorDAO;
import br.com.model.dao.TorneioDAO;

public class PostgreFactory extends DAOFactory {
    @Override
    public AvisoDAO createAvisoDAO() {
        return null;
    }

    @Override
    public CashGameDAO createCashGameDAO() {
        return null;
    }

    @Override
    public JogadorDAO createJogadorDAO() {
        return null;
    }

    @Override
    public TorneioDAO createTorneioDAO() {
        return null;
    }
}
