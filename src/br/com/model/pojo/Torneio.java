package br.com.model.pojo;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class Torneio {
    private Long id;
    private String titulo;
    private String buyin;
    private String modo;
    private String jogo;
    private int stack;
    private List<Jogador> jogadores;

    public Torneio() {
    }

    public Torneio(Long id, String titulo, String buyin, String modo, String jogo, int stack) {
        this.id = id;
        this.titulo = titulo;
        this.buyin = buyin;
        this.modo = modo;
        this.jogo = jogo;
        this.stack = stack;
    }

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

    public String getBuyin() {
        return buyin;
    }

    public void setBuyin(String buyin) {
        this.buyin = buyin;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Torneio torneio = (Torneio) o;

        return id.equals(torneio.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Torneio{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", buyin='" + buyin + '\'' +
                ", modo='" + modo + '\'' +
                ", jogo='" + jogo + '\'' +
                ", stack=" + stack +
                '}';
    }
}
