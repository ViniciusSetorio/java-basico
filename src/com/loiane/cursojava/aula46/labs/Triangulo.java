package com.loiane.cursojava.aula46.labs;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (altura * base) / 2;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
