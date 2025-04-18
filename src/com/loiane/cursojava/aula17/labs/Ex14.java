package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int numPares = 0;
        int numImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número:");
            num = scan.nextInt();

            if (num % 2 == 0) {
                numPares++;
            } else {
                numImpares++;
            }
        }
        System.out.println("Quant. números pares: " + numPares + " | Quant. números Ímpares: " + numImpares);
    }
}