package com.loiane.cursojava.aula51;

public class UsandoMinhaException {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denominador = {2, 0, 4, 8, 0, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denominador[i]);
                }
                System.out.println(numeros[i] + " / " + denominador[i] + " = " + numeros[i] / denominador[i]);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro.");
                e.printStackTrace();
            }
        }
    }
}
