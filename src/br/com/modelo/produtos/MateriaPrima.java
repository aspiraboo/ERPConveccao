package br.com.modelo.produtos;

import java.util.Date;

public class MateriaPrima {

    private String modelo;
    private int quantidade;
    private String cor;
    private double tamanho;
    private Date horaEntrada;
    private int id;

    public MateriaPrima() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private String nome;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "MateriaPrima{" + "modelo=" + modelo + ", quantidade=" + quantidade + ", cor=" + cor + ", tamanho=" + tamanho + ", horaEntrada=" + horaEntrada + ", id=" + id + ", nome=" + nome + '}';
    }
}
