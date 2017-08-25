package br.com.model.dao.mysql;
import br.com.model.dao.CashGameDAO;
import br.com.model.dao.factory.MySQLFactory;
import br.com.model.vo.AvisoVO;
import br.com.model.vo.CashGameVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class CashGameMySQLDAO extends CashGameDAO{
    private static CashGameMySQLDAO instance;

    private CashGameMySQLDAO(){}

    public static CashGameMySQLDAO getInstance() {
        if(instance == null)
            instance = new CashGameMySQLDAO();
        return instance;
    }
    @Override
    public void insert(CashGameVO cashGame) throws Exception{
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("insert into cash_game (titulo, " +
                "buyin, blinds, tamanho_mesa, tipo_jogo)" +
                "value (?, ?, ?, ?, ?)");
        statement.setString(1, cashGame.getTitulo());
        statement.setDouble(2, cashGame.getBuyin());
        statement.setString(3, cashGame.getBlinds());
        statement.setInt(4, cashGame.getTamanhoMesa());
        statement.setString(5, cashGame.getTipoJogo());
        statement.executeUpdate();
        statement.close();
    }

    @Override
    public void update(CashGameVO cashGame) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public CashGameVO selectById(Long id) {
        return null;
    }

    @Override
    public List<CashGameVO> list() throws Exception{
        List<CashGameVO> cashGames= new ArrayList<>();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from cash_game");
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            CashGameVO cashGame = new CashGameVO();
            cashGame.setId(rs.getLong("id"));
            cashGame.setBlinds(rs.getString("blinds"));
            cashGame.setTitulo(rs.getString("titulo"));
            cashGame.setTamanhoMesa(rs.getInt("tamanho_mesa"));
            cashGame.setTipoJogo(rs.getString("tipo_jogo"));
            cashGame.setBuyin(rs.getDouble("buyin"));
            cashGames.add(cashGame);
        }
        return cashGames;
    }
}
