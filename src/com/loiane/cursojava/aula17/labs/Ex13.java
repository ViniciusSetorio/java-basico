package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base:");
        int base = scan.nextInt();

        System.out.println("Entre com a potência:");
        int potencia = scan.nextInt();

        int resultado = base;
        for (int i = 1; i < potencia; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}