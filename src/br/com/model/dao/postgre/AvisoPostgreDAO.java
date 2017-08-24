package br.com.model.dao.postgre;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.mysql.AvisoMySQLDAO;
import br.com.model.vo.AvisoVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class AvisoPostgreDAO extends AvisoDAO{
    private static AvisoPostgreDAO instance;

    private AvisoPostgreDAO(){}

    public static AvisoPostgreDAO getInstance() {
        if(instance == null)
            instance = new AvisoPostgreDAO();
        return instance;
    }
    @Override
    public void insert(AvisoVO aviso) {
        
    }

    @Override
    public void update(AvisoVO aviso) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public AvisoVO selectById(Long id) {
        return null;
    }

    @Override
    public List<AvisoVO> list() {
        return null;
    }
}
