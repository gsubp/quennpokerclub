package br.com.model.dao.factory;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.CashGameDAO;
import br.com.model.dao.JogadorDAO;
import br.com.model.dao.TorneioDAO;
import br.com.model.dao.mysql.AvisoMySQLDAO;
import br.com.model.dao.mysql.CashGameMySQLDAO;
import br.com.model.dao.mysql.JogadorMySQLDAO;
import br.com.model.dao.mysql.TorneioMySQLDAO;

import java.sql.Connection;

public class MySQLFactory extends DAOFactory{
    @Override
    public AvisoDAO createAvisoDAO() {
        return new AvisoMySQLDAO();
    }

    @Override
    public CashGameDAO createCashGameDAO() {
        return new CashGameMySQLDAO();
    }

    @Override
    public JogadorDAO createJogadorDAO() {
        return new JogadorMySQLDAO();
    }

    @Override
    public TorneioDAO createTorneioDAO() {
        return new TorneioMySQLDAO();
    }
}