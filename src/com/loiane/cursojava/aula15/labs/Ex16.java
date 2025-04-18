package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro valor:");
        double a = scan.nextDouble();
        if (a == 0) {
            System.out.println("Não é uma equação de segunda grau.");
        } else {
            System.out.println("Entre com o segundo valor:");
            double b = scan.nextDouble();

            System.out.println("Entre com o terceiro valor:");
            double c = scan.nextDouble();

            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                System.out.println("Delta: " + delta);

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("A raíz X1 é: " + x1);
                System.out.println("A raíz X2 é: " + x2);
            }
        }
    }
}
