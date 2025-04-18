package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = scan.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            System.out.println("O número " + numero + " não é primo.");
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }
    }
}