package com.controledeestoque.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "marca_id", nullable = false)
    private int marca_id;
    @Column(name = "modelo_id", nullable = false)
    private int modelo_id;
    @Column(name = "tipo_id", nullable = false)
    private int tipo_id;
    @Column(name = "cor", nullable = false)
    private String cor;
    @Column(name = "quilometragem", nullable = false)
    private long quilometragem;
    @Column(name = "ano_fabricacao", nullable = false)
    private int ano_fabricacao;
    @Column(name = "preco", nullable = false)
    private float preco;
    @Column(name = "situacao_id", nullable = false)
    private int situacao_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(int marca_id) {
        this.marca_id = marca_id;
    }

    public int getModelo_id() {
        return modelo_id;
    }

    public void setModelo_id(int modelo_id) {
        this.modelo_id = modelo_id;
    }

    public int getTipo_id() {
        return tipo_id;
    }

    public void setTipo_id(int tipo_id) {
        this.tipo_id = tipo_id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getSituacao_id() {
        return situacao_id;
    }

    public void setSituacao_id(int situacao_id) {
        this.situacao_id = situacao_id;
    }
}
