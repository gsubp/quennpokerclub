package br.com.model.dao;

import br.com.model.dao.factory.DAOFactory;
import br.com.model.vo.JogadorVO;

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
        JogadorDAO dao = DAOFactory.getFacorty(getBanco()).createJogadorDAO();
        return dao.login(login, senha);
    }


}
