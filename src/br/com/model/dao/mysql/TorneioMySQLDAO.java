package br.com.model.dao.mysql;

import br.com.model.dao.TorneioDAO;
import br.com.model.dao.factory.MySQLFactory;
import br.com.model.pojo.Torneio;
import br.com.model.vo.AvisoVO;
import br.com.model.vo.TorneioVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
    public List<TorneioVO> list() throws Exception {
        List<TorneioVO> torneios = new ArrayList<>();

        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from torneio");
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            TorneioVO torneio = new TorneioVO();
            torneio.setId(rs.getLong("id"));
            torneio.setTitulo(rs.getString("titulo"));
            torneio.setEstrutura(rs.getString("estrutura"));
            torneio.setBuyin(rs.getDouble("buyin"));
            torneio.setRebuy(rs.getBoolean("rebuy"));
            torneio.setAddon(rs.getBoolean("addon"));
            torneio.setInicio(rs.getDate("data_inicio"));
            torneios.add(torneio);
        }
        return torneios;
    }
}
