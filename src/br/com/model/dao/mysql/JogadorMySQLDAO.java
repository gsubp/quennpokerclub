package br.com.model.dao.mysql;

import br.com.model.dao.JogadorDAO;
import br.com.model.dao.factory.MySQLFactory;
import br.com.model.vo.JogadorVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class JogadorMySQLDAO extends JogadorDAO{
    private static JogadorMySQLDAO instance;

    private JogadorMySQLDAO(){}

    public static JogadorMySQLDAO getInstance(){
        if(instance == null)
            instance = new JogadorMySQLDAO();
        return instance;
    }

    @Override
    public void insert(JogadorVO jogador) {

    }

    @Override
    public void update(JogadorVO jogador) {

    }

    @Override
    public void remove(Long id) throws Exception{
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("delete from jogador where id = ?");
        statement.setLong(1, id);
        statement.executeUpdate();
        statement.close();
    }

    @Override
    public JogadorVO select(Long id) throws Exception{
        JogadorVO jogador = new JogadorVO();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from jogador " +
                "where id = ?");
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            jogador.setId(rs.getLong("id"));
            jogador.setNome(rs.getString("nome"));
            jogador.setCpf(rs.getString("cpf"));
            jogador.setPontos(rs.getInt("pontos"));
            jogador.setTelefone(rs.getString("telefone"));
            jogador.setLogin(rs.getString("login"));
            jogador.setSenha(rs.getString("senha"));
            jogador.setAdmin(rs.getBoolean("is_admin"));
        }
        rs.close();
        statement.close();
        return jogador;
    }

    @Override
    public List<JogadorVO> list() throws Exception{
        List<JogadorVO> jogadores = new ArrayList<>();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from jogador");
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

    @Override
    public JogadorVO login(String login, String senha) throws Exception{
        JogadorVO jogador = new JogadorVO();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from jogador " +
                "where login = ? and senha = ?");
        statement.setString(1, login);
        statement.setString(2, senha);
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            jogador.setId(rs.getLong("id"));
            jogador.setAdmin(rs.getBoolean("is_admin"));
        }
        rs.close();
        statement.close();
        return jogador;
    }

    @Override
    public List<JogadorVO> listClassificacao() throws Exception{
        List<JogadorVO> jogadores = new ArrayList<>();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from jogador " +
                "order by pontos desc");
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
