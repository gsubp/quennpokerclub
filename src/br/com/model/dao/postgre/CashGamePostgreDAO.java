package br.com.model.dao.postgre;

import br.com.model.dao.AvisoDAO;
import br.com.model.dao.CashGameDAO;
import br.com.model.vo.CashGameVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class CashGamePostgreDAO extends CashGameDAO{
    private static CashGamePostgreDAO instance;

    private CashGamePostgreDAO(){}

    public static CashGamePostgreDAO getInstance() {
        if(instance == null)
            instance = new CashGamePostgreDAO();
        return instance;
    }
    @Override
    public void insert(CashGameVO cashGame) {

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
    public List<CashGameVO> list() {
        return null;
    }
}
