package com.loiane.cursojava.aula34.labs;

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
    public static int calcularFatorial(int num1) {
        int total = 1;

        if (num1 == 0) {
            return 1;

        } else {
            for (int i = num1; i > 1; i--) {
                total *= i;
        }
            return total;
        }
    }
}
