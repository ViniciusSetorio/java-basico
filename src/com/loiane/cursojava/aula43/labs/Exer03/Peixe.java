package com.loiane.cursojava.aula43.labs.Exer03;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super();
        setPatas(0);
        setAmbiente("mar");
        setCor("cinzenta");
        this.caracteristicas = "barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        String s = super.toString();
        s += "Caracteristicas: " + caracteristicas;

        return s;
    }
}
