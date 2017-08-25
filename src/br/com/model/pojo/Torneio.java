package br.com.model.pojo;

import java.util.Date;
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
    private List<Jogador> jogadores;

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

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }


}
