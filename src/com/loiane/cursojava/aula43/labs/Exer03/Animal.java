package com.loiane.cursojava.aula43.labs.Exer03;

public class Animal {

    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        setPatas(4);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        String s = "";
        s += "Animal: " + nome + "\n";
        s += "Comprimento: " + comprimento + " cm\n";
        s += "Patas: " + patas + "\n";
        s += "Cor: " + cor + "\n";
        s += "Ambiente: " + ambiente + "\n";
        s += "Velocidade: " + velocidade + " m/s\n";

        return s;
    }
}