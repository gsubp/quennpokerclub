package br.com.model.dao;

import br.com.model.vo.AvisoVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class AvisoDAO {
    public abstract void insert(AvisoVO aviso);
    public abstract void update(AvisoVO aviso);
    public abstract void remove(Long id);
    public abstract AvisoVO selectById(Long id);
    public abstract List<AvisoVO> list();
}
