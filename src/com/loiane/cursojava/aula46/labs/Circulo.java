package com.loiane.cursojava.aula46.labs;

public class Circulo extends Figura2D implements DimensaoSuperficial {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
