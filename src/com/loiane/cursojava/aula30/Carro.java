package com.loiane.cursojava.aula30;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro() {

    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com três parâmetros.");
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com dois parâmetros.");
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia() {

        System.out.println("Método obter autonomia foi chamado.");

        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km) {

        return km /consumoCombustivel;
    }
}
