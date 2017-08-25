package br.com.model.dao;

import br.com.model.vo.CashGameVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class CashGameDAO {
    public abstract void insert(CashGameVO cashGame) throws Exception;
    public abstract void update(CashGameVO cashGame);
    public abstract void remove(Long id);
    public abstract CashGameVO selectById(Long id);
    public abstract List<CashGameVO> list() throws Exception;
}
