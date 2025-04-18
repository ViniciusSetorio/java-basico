package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = scan.nextInt();

        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % 2 == 0) {
                System.out.println("Não é primo - Divisível por " + i);
                primo = false;
            }
        }

        if (primo) {
            System.out.println("É primo.");
        }
    }
}
