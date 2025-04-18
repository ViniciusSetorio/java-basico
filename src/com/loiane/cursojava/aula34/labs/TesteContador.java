package com.loiane.cursojava.aula34.labs;

public class TesteContador {

    static void imprimirValor() {
        System.out.println(Contador.retornarContador());
    }

    public static void main(String[] args) {

        imprimirValor();

        Contador.incrementarContador();
        Contador.incrementarContador();

        imprimirValor();

        Contador.zerarContador();

        imprimirValor();

        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        imprimirValor();
    }
}
