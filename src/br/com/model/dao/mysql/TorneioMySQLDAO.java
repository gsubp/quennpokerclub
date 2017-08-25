package br.com.model.dao.mysql;

import br.com.model.dao.TorneioDAO;
import br.com.model.dao.factory.MySQLFactory;
import br.com.model.vo.JogadorVO;
import br.com.model.vo.TorneioVO;

import java.sql.Connection;
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

    @Override
    public void inset(TorneioVO torneio) throws Exception {
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("insert into torneio (titulo, " +
                "buyin, rebuy, addon, estrutura, data_inicio) value (?, ?, ?, ?, ?, ?)");
        statement.setString(1, torneio.getTitulo());
        statement.setDouble(2, torneio.getBuyin());
        statement.setBoolean(3, torneio.isRebuy());
        statement.setBoolean(4, torneio.isAddon());
        statement.setString(5, torneio.getEstrutura());
        statement.setString(6, torneio.getInicio());
        statement.executeUpdate();
        statement.close();
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
            torneio.setInicio(rs.getString("data_inicio"));
            torneios.add(torneio);
        }
        return torneios;
    }

    @Override
    public List<JogadorVO> loadJogadores(Long linkTorneio) throws Exception {
        List<JogadorVO> jogadores = new ArrayList<>();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from jogador j " +
                "join jogador_torneio jt on jt.id_torneio = j.id " +
                "join jogador j on jt.id_jogador = j.id");
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            JogadorVO jogador = new JogadorVO();
            jogador.setId(rs.getLong("id"));
            jogadores.add(jogador);
        }
        rs.close();
        statement.close();
        return jogadores;
    }
}
