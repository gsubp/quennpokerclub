package br.com.model.pojo;

import java.util.Date;

/**
 * Created by guilh on 06/07/2017.
 */
public class Aviso {
    private Long id;
    private String titulo;
    private String mensagem;
    private Date data;
    private String autor;

    public Aviso() {}

    public Aviso(Long id, String titulo, String mensagem, Date data, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.data = data;
        this.autor = autor;
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

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aviso aviso = (Aviso) o;

        return id.equals(aviso.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Aviso{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", mensagem='" + mensagem + '\'' +
                ", data=" + data +
                ", autor='" + autor + '\'' +
                '}';
    }
}
