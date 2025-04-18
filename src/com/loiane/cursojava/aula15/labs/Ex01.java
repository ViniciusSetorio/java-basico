package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else {
            System.out.println("O maior número é " + num2);
        }
    }
}