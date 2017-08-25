package br.com.model.dao;

import br.com.model.pojo.Torneio;
import br.com.model.vo.TorneioVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class TorneioDAO {
    public abstract void inset(TorneioVO torneio) throws Exception;
    public abstract void update(TorneioVO torneio);
    public abstract void remove(Long id);
    public abstract TorneioVO select(Long id);
    public abstract List<TorneioVO> list() throws Exception;
}
