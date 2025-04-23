package com.loiane.cursojava.aula46.labs;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * Math.pow(getLado(), 2);
    }

    @Override
    public double calcularVolume() {
        return Math.pow(getLado(), 3);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cubo{" +
                "lado=" + lado +
                '}';
    }
}
