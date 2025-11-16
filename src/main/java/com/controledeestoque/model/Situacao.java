package com.controledeestoque.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_situacao")
public class Situacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "situacao", nullable = false)
    private String situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
