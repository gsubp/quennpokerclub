package br.com.model.vo;

import br.com.model.pojo.Jogador;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class TorneioVO {
    public Long id;
    public String titulo;
    public String buyin;
    public String modo;
    public String jogo;
    public int stack;
    public List<Jogador> jogadores;
}
