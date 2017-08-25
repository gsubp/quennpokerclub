package br.com.model.pojo;

import br.com.model.dao.FachadaDAO;
import br.com.model.vo.JogadorVO;

import java.util.List;

public class JogadoresProxy {
    private Long linkTorneio;
    private List<JogadorVO> jogadores;

    public JogadoresProxy(Long linkTorneio){
        this.linkTorneio = linkTorneio;
    }

    public List<JogadorVO> getJogadores() throws Exception {
        if(jogadores == null)
            this.jogadores = FachadaDAO.getJogadoresTorneio(this.linkTorneio);
        return jogadores;
    }
}
