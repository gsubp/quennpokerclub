package br.com.model.dao.postgre;

import br.com.model.dao.TorneioDAO;
import br.com.model.vo.JogadorVO;
import br.com.model.vo.TorneioVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class TorneioPostgreDAO extends TorneioDAO{
    private static TorneioPostgreDAO instance;

    private TorneioPostgreDAO(){}

    public static TorneioPostgreDAO getInstance() {
        if(instance == null)
            instance = new TorneioPostgreDAO();
        return instance;
    }

    @Override
    public void inset(TorneioVO torneio) {

    }

    @Override
    public void update(TorneioVO torneio) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public TorneioVO select(Long id) {
        return null;
    }

    @Override
    public List<TorneioVO> list() {
        return null;
    }

    @Override
    public List<JogadorVO> loadJogadores(Long linkTorneio) throws Exception {
        return null;
    }
}
