package com.loiane.cursojava.aula34.labs;

public class TesteCalculadora {

    static void imprimeResultado(double resultado) {
        System.out.println(resultado);
    }

    public static void main(String[] args) {

        imprimeResultado(Calculadora.somar(1, 2));

        imprimeResultado(Calculadora.subtrair(1, 2));

        imprimeResultado(Calculadora.divir(5, 2));

        imprimeResultado(Calculadora.multiplicar(4, 2));

        imprimeResultado(Calculadora.elevar(4, 2));

        imprimeResultado(Calculadora.calcularFatorial(5));
    }
}
