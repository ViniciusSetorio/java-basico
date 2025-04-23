package com.loiane.cursojava.aula46.labs;

public class Quadrado extends Figura2D implements DimensaoSuperficial {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(getLado(), 2);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Quadrado{" +
                "lado=" + lado +
                '}';
    }
}
