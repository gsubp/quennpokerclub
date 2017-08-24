package br.com.model.dao.mysql;
import br.com.model.dao.CashGameDAO;
import br.com.model.vo.CashGameVO;

import java.sql.Connection;
import java.sql.DriverManager;
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
