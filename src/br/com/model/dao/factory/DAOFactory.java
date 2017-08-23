package br.com.model.dao.factory;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.CashGameDAO;
import br.com.model.dao.JogadorDAO;
import br.com.model.dao.TorneioDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class DAOFactory {
    public abstract AvisoDAO createAvisoDAO();
    public abstract CashGameDAO createCashGameDAO();
    public abstract JogadorDAO createJogadorDAO();
    public abstract TorneioDAO createTorneioDAO();
}