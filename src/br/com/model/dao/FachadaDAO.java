package br.com.model.dao;

import br.com.model.dao.factory.DAOFactory;
import br.com.model.vo.AvisoVO;
import br.com.model.vo.CashGameVO;
import br.com.model.vo.JogadorVO;
import br.com.model.vo.TorneioVO;

import java.util.Date;
import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class FachadaDAO {
    private static String banco = "mysql";

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String b){
        banco = b;
    }

    public static JogadorVO login(String login, String senha) throws Exception{
        return DAOFactory.getFacorty(getBanco()).createJogadorDAO().login(login, senha);
    }


    public static List<AvisoVO> listAviso() throws Exception{
        return DAOFactory.getFacorty(getBanco()).createAvisoDAO().list();
    }

    public static List<TorneioVO> listTorneio() throws Exception{
        return DAOFactory.getFacorty(getBanco()).createTorneioDAO().list();
    }

    public static List<CashGameVO> listCashGame() throws Exception{
        return DAOFactory.getFacorty(getBanco()).createCashGameDAO().list();
    }

    public static List<JogadorVO> listClassificacao() throws Exception {
        return DAOFactory.getFacorty(getBanco()).createJogadorDAO().listClassificacao();
    }

    public static JogadorVO getJogador(Long id) throws Exception {
        return DAOFactory.getFacorty(getBanco()).createJogadorDAO().select(id);
    }

    public static void novoAviso(AvisoVO aviso) throws Exception {
        aviso.setData(new Date().toString());
        DAOFactory.getFacorty(getBanco()).createAvisoDAO().insert(aviso);
    }

    public static void novoCash(CashGameVO cash) throws Exception {
        DAOFactory.getFacorty(getBanco()).createCashGameDAO().insert(cash);
    }

    public static void novoTorneio(TorneioVO torneio) throws Exception {
        DAOFactory.getFacorty(getBanco()).createTorneioDAO().inset(torneio);
    }

    public static List<JogadorVO> getJogadoresTorneio(Long linkTorneio) throws Exception {
        return DAOFactory.getFacorty(getBanco()).createTorneioDAO().loadJogadores(linkTorneio);
    }
}
