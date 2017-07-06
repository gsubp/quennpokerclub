package br.com.model.vo;

import br.com.model.pojo.Jogador;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class CashGameVO {
    public Long id;
    public String buyin;
    public String jogo;
    public int qnt_jogadores;
    public List<Jogador> jogadores;

}
