package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = scan.nextInt();

        for (int i = 2; i <= numero; i++) {
            if (i == 2) {
                System.out.println(i);
            }

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}