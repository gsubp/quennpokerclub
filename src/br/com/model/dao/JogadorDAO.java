package br.com.model.dao;

import br.com.model.vo.JogadorVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public abstract class JogadorDAO {
    public abstract void insert(JogadorVO jogador);
    public abstract void update(JogadorVO jogador);
    public abstract void remove(Long id) throws Exception;
    public abstract JogadorVO select(Long id) throws Exception;
    public abstract List<JogadorVO> list() throws Exception;
    public abstract JogadorVO login(String login, String senha) throws Exception;
    public abstract List<JogadorVO> listClassificacao() throws Exception;
}
