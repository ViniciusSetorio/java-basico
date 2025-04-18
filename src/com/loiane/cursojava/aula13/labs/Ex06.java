package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio de um círculo: ");
        int raio = scan.nextInt();
        double area = 3.14 * Math.pow(raio, 2);
        System.out.println("A área do círculo é: " + area);
    }
}
