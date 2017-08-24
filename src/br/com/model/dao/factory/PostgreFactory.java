package br.com.model.dao.factory;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.CashGameDAO;
import br.com.model.dao.JogadorDAO;
import br.com.model.dao.TorneioDAO;
import br.com.model.dao.postgre.AvisoPostgreDAO;
import br.com.model.dao.postgre.CashGamePostgreDAO;
import br.com.model.dao.postgre.JogadorPostgreDAO;
import br.com.model.dao.postgre.TorneioPostgreDAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreFactory extends DAOFactory {
    private static final String USER = "postgres";
    private static final String PASS = "1234";
    private static final String URL = "jdbc:postgre://localhost:5432/queenpokerclub";
    private static Connection connection;

    public static synchronized Connection getConnection() throws Exception{
        if(connection != null)
            connection = DriverManager.getConnection(URL,USER,PASS);
        return connection;
    }
    @Override
    public AvisoDAO createAvisoDAO() {
        return AvisoPostgreDAO.getInstance();
    }

    @Override
    public CashGameDAO createCashGameDAO() {
        return CashGamePostgreDAO.getInstance();
    }

    @Override
    public JogadorDAO createJogadorDAO() {
        return JogadorPostgreDAO.getInstance();
    }

    @Override
    public TorneioDAO createTorneioDAO() {
        return TorneioPostgreDAO.getInstance();
    }
}
