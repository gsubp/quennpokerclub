package br.com.model.pojo;

/**
 * Created by guilh on 06/07/2017.
 */
public class Jogador {
    private Long id;
    private String nome;
    private String telefone;

    public Jogador() {
    }

    public Jogador(Long od, String nome, String telefone) {
        this.id = od;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jogador jogador = (Jogador) o;

        return id.equals(jogador.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
