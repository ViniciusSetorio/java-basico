package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de três lados de um triângulo:");
        double lado1 = scan.nextDouble();
        double lado2 = scan.nextDouble();
        double lado3 = scan.nextDouble();

        if (lado1 + lado2 > lado3 || lado1 + lado3 > lado2 || lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Os lados formam um triângulo equilátero.");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Os lados formam um triângulo Isósceles.");
            } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("Os lados formam um triângulo Escaleno.");
            }
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}