package br.com.model.dao;

import br.com.model.vo.AvisoVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class AvisoDAO {
    public abstract void insert(AvisoVO aviso) throws Exception;
    public abstract void update(AvisoVO aviso) throws Exception;
    public abstract void remove(Long id) throws Exception;
    public abstract AvisoVO selectById(Long id) throws Exception;
    public abstract List<AvisoVO> list() throws Exception;
}
