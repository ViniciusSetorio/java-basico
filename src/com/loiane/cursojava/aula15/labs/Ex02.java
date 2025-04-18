package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um valor:");
        int valor = scan.nextInt();

        if (valor < 0) {
            System.out.println("Valor negativo.");
        } else {
            System.out.println("Valor positivo.");
        }
    }
}