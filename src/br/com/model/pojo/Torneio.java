package br.com.model.pojo;

import br.com.model.vo.JogadorVO;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class Torneio {
    private Long id;
    private String titulo;
    private double buyin;
    private boolean rebuy;
    private boolean addon;
    private String estrutura;
    private String inicio;
    private JogadoresProxy proxy;
    private List<JogadorVO> jogadores;

    public Torneio(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getBuyin() {
        return buyin;
    }

    public void setBuyin(double buyin) {
        this.buyin = buyin;
    }

    public boolean isRebuy() {
        return rebuy;
    }

    public void setRebuy(boolean rebuy) {
        this.rebuy = rebuy;
    }

    public boolean isAddon() {
        return addon;
    }

    public void setAddon(boolean addon) {
        this.addon = addon;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public List<JogadorVO> getJogadores() throws Exception {
        if(jogadores == null) {
            proxy = new JogadoresProxy(this.id);
            this.jogadores = proxy.getJogadores();
        }
        return jogadores;
    }



}
