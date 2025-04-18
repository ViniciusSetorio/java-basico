package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número:");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
}