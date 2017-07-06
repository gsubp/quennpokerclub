package br.com.model.pojo;

import java.util.List;

/**
 * Created by guilh on 06/07/2017.
 */
public class CashGame {
    private Long id;
    private String buyin;
    private String jogo;
    private int qnt_jogadores;
    private List<Jogador> jogadores;

    public CashGame() {
    }

    public CashGame(Long id, String buyin, String jogo, int qnt_jogadores) {
        this.id = id;
        this.buyin = buyin;
        this.jogo = jogo;
        this.qnt_jogadores = qnt_jogadores;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuyin() {
        return buyin;
    }

    public void setBuyin(String buyin) {
        this.buyin = buyin;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public int getQnt_jogadores() {
        return qnt_jogadores;
    }

    public void setQnt_jogadores(int qnt_jogadores) {
        this.qnt_jogadores = qnt_jogadores;
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

        CashGame cashGame = (CashGame) o;

        return id.equals(cashGame.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "CashGame{" +
                "id=" + id +
                ", buyin='" + buyin + '\'' +
                ", jogo='" + jogo + '\'' +
                ", qnt_jogadores=" + qnt_jogadores +
                '}';
    }
}
