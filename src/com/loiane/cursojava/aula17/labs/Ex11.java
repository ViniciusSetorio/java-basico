package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int soma = 0;
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i + " ");
                soma+= i;
            }
        } else if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                System.out.println(i + " ");
                soma+= i;
            }
        } else {
            System.out.println("Num1 não pode ser igual a Num2.");
        }
        System.out.println("Soma: " + soma);
    }
}