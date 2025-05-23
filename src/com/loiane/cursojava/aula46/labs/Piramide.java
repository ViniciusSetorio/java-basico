package com.loiane.cursojava.aula46.labs;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

    private double altura;
    private double arestaBase;
    private double apotema;
    private Figura2D base;
    private int numPoliBase;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public int getNumPoliBase() {
        return numPoliBase;
    }

    public void setNumPoliBase(int numPoliBase) {
        this.numPoliBase = numPoliBase;
    }

    @Override
    public double calcularArea() {
        if (base != null) {
            return numPoliBase * ((arestaBase * apotema) / 2) + base.calcularArea();
        }
        return 0;
    }

    @Override
    public double calcularVolume() {

        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Piramide{" +
                "altura=" + altura +
                ", arestaBase=" + arestaBase +
                ", apotema=" + apotema +
                ", base=" + base +
                ", numPoliBase=" + numPoliBase +
                '}';
    }
}
