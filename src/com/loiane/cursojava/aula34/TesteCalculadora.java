package com.loiane.cursojava.aula34;

public class TesteCalculadora {

    static int soma;

    public static void main(String[] args) {

        //MinhaCalculadora calculadora = new MinhaCalculadora();

        //calculadora.soma(1, 2);
        //calculadora.soma(1.0, 2.0);

        soma = MinhaCalculadora.soma(1, 2);
        System.out.println(soma);
    }
}
