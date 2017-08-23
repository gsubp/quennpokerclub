package br.com.model.dao;

import br.com.model.vo.JogadorVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class JogadorDAO {
    public abstract void insert(JogadorVO jogador);
    public abstract void update(JogadorVO jogador);
    public abstract void remove(Long id);
    public abstract JogadorVO select(Long id);
    public abstract List<JogadorVO> list();
}
