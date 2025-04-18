package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int num = scan.nextInt();

        if (num < 1 || num > 10) {
            System.out.println("Número inválido.");
        } else {
            System.out.println("Tabuada de " + num);
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + (num * i));
            }
        }
    }
}