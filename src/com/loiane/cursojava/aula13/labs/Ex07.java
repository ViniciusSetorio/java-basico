package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um o valor de um dos lados do quadrado: ");
        int lado = scan.nextInt();
        double area = Math.pow(lado, 2);
        System.out.println("Área do quadrado em dobro: " + area * 2);
    }
}