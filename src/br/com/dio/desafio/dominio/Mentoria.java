package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descrocao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrocao() {
        return descrocao;
    }

    public void setDescrocao(String descrocao) {
        this.descrocao = descrocao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descrocao='" + descrocao + '\'' +
                ", data=" + data +
                '}';
    }
}
