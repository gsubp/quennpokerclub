package br.com.model.dao.mysql;

import br.com.model.dao.TorneioDAO;
import br.com.model.vo.TorneioVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class TorneioMySQLDAO extends TorneioDAO{
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/queenpokerclub";
    private static Connection connection;
    private static TorneioMySQLDAO instance;

    private TorneioMySQLDAO(){}

    public static TorneioMySQLDAO getInstance() {
        if(instance == null)
            instance = new TorneioMySQLDAO();
        return instance;
    }

    private static synchronized Connection getConnection() throws Exception{
        if(connection != null)
            connection = DriverManager.getConnection(URL,USER,PASS);
        return connection;
    }
    @Override
    public void inset(TorneioVO torneio) {

    }

    @Override
    public void update(TorneioVO torneio) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public TorneioVO select(Long id) {
        return null;
    }

    @Override
    public List<TorneioVO> list() {
        return null;
    }
}
