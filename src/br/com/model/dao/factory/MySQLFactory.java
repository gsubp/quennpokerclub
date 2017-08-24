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
import java.sql.DriverManager;

public class MySQLFactory extends DAOFactory{
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/queenpokerclub";
    private static Connection connection;

    public static synchronized Connection getConnection() throws Exception{
        if(connection == null)
            connection = DriverManager.getConnection(URL,USER,PASS);
        return connection;
    }

    @Override
    public AvisoDAO createAvisoDAO() {
        return AvisoMySQLDAO.getInstance();
    }

    @Override
    public CashGameDAO createCashGameDAO() {
        return CashGameMySQLDAO.getInstance();
    }

    @Override
    public JogadorDAO createJogadorDAO() {
        return JogadorMySQLDAO.getInstance();
    }

    @Override
    public TorneioDAO createTorneioDAO() {
        return TorneioMySQLDAO.getInstance();
    }
}