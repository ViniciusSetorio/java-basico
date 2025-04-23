package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomenticado, AnimalEstimacao {

    private String raca;
    private int tamanho;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void amamentar() {

    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
