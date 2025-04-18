package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int numero = scan.nextInt();

        int fatorial = 1;
        System.out.print("!" + numero);
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.println(i);
        }
        System.out.println("Resultado: " + fatorial);
    }
}