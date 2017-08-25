package br.com.model.dao.postgre;

import br.com.model.dao.JogadorDAO;
import br.com.model.vo.JogadorVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class JogadorPostgreDAO extends JogadorDAO{
    private static JogadorPostgreDAO instance;

    private JogadorPostgreDAO(){}

    public static JogadorPostgreDAO getInstance() {
        if(instance == null)
            instance = new JogadorPostgreDAO();
        return instance;
    }

    @Override
    public void insert(JogadorVO jogador) {

    }

    @Override
    public void update(JogadorVO jogador) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public JogadorVO select(Long id) {
        return null;
    }

    @Override
    public List<JogadorVO> list() {
        return null;
    }

    @Override
    public JogadorVO login(String login, String senha) {
        return null;
    }

    @Override
    public List<JogadorVO> listClassificacao() throws Exception {
        return null;
    }
}
