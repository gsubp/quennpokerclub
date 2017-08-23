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
    private int rebuy;
    private int addon;
    private String estrutura;
    private Date inicio;
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

    public int getRebuy() {
        return rebuy;
    }

    public void setRebuy(int rebuy) {
        this.rebuy = rebuy;
    }

    public int getAddon() {
        return addon;
    }

    public void setAddon(int addon) {
        this.addon = addon;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
