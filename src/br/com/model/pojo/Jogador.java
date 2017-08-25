package br.com.model.pojo;

import br.com.model.dao.FachadaDAO;
import br.com.model.dao.factory.DAOFactory;
import br.com.model.vo.JogadorVO;
import jdk.nashorn.internal.scripts.JO;

/**
 * Created by guilh on 06/07/2017.
 */
public class Jogador {
    private Long id;
    private String nome;
    private String cpf;
    private int pontos;
    private String telefone;
    private String login;
    private String senha;
    private boolean isAdmin;

    public Jogador() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() throws Exception {
        if(this.nome == null){
           JogadorVO jogador =  FachadaDAO.getJogador(this.id);
           this.nome = jogador.getNome();
           this.cpf = jogador.getCpf();
           this.pontos = jogador.getPontos();
           this.telefone = jogador.getTelefone();
           this.login = jogador.getLogin();
           this.senha = jogador.getSenha();
           this.isAdmin = jogador.isAdmin();
        }
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getPontos() {
        return this.pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void setAdmin(boolean admin) {
        this.isAdmin = admin;
    }
}
