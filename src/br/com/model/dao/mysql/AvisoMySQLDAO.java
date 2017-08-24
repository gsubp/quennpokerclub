package br.com.model.dao.mysql;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.factory.MySQLFactory;
import br.com.model.pojo.Aviso;
import br.com.model.vo.AvisoVO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class AvisoMySQLDAO extends AvisoDAO{
    private static AvisoMySQLDAO instance;

    private AvisoMySQLDAO(){}

    public static AvisoDAO getInstance() {
        if(instance == null)
            instance = new AvisoMySQLDAO();
        return instance;
    }

    @Override
    public void insert(AvisoVO aviso) throws Exception{
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("insert into aviso " +
                "value (?, ?, ?)");
        statement.setString(1, aviso.getMensagem());
        statement.setDate(2, (Date) aviso.getData());
        statement.setString(3, aviso.getAutor());
        statement.executeUpdate();
        statement.close();
    }

    @Override
    public void update(AvisoVO aviso) throws Exception{
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("update aviso set mensagem = ?," +
                "data = ?, autor = ? where id = ?");
        statement.setString(1, aviso.getMensagem());
        statement.setDate(2, (Date) aviso.getData());
        statement.setString(3, aviso.getAutor());
        statement.setLong(4, aviso.getId());
        statement.executeUpdate();
        statement.close();
    }

    @Override
    public void remove(Long id) throws Exception{
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("delete from aviso where id = ?");
        statement.setLong(1, id);
        statement.executeUpdate();
        statement.close();
    }

    @Override
    public AvisoVO selectById(Long id) throws Exception{
        AvisoVO aviso = new AvisoVO();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from aviso where id = ?");
        statement.setLong(1, id);
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            aviso.setId(rs.getLong("id"));
            aviso.setMensagem(rs.getString("mesnsagem"));
            aviso.setAutor(rs.getString("autor"));
            aviso.setData(rs.getDate("data"));
        }
        return aviso;
    }

    @Override
    public List<AvisoVO> list() throws Exception{
        List<AvisoVO> avisos = new ArrayList<>();
        PreparedStatement statement = MySQLFactory.getConnection().prepareStatement("select * from aviso");
        ResultSet rs = statement.executeQuery();
        while(rs.next()){
            AvisoVO aviso = new AvisoVO();
            aviso.setId(rs.getLong("id"));
            aviso.setMensagem(rs.getString("mesnsagem"));
            aviso.setAutor(rs.getString("autor"));
            aviso.setData(rs.getDate("data"));
            avisos.add(aviso);
        }
        return avisos;
    }
}
