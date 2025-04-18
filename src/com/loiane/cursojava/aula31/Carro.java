package com.loiane.cursojava.aula31;

public class Carro {

    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {

        System.out.println("Método obter autonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km) {
        return km /consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        return divideKmPorConsumoCombustivel(km);
    }
}
