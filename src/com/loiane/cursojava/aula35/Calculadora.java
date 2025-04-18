package com.loiane.cursojava.aula35;

public class Calculadora {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static double divir(double num1, double num2) {
        return num1 / num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double elevar(int num1, int pot) {
        return Math.pow(num1, pot);
    }

    public static int fatorial(int num1) {

        if (num1 == 0) {
            return 1;
        }

        return num1 * fatorial(num1 - 1);
    }
}
