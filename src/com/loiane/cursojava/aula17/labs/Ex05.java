package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a população do país A:");
        int paisA = scan.nextInt();

        System.out.println("Taxa de crescimento:");
        double taxaCrescimentoA = scan.nextDouble();

        System.out.println("Entre com a população do país B:");
        int paisB = scan.nextInt();

        System.out.println("Taxa de crescimento:");
        double taxaCrescimentoB = scan.nextDouble();

        int anos = 0;
        while (paisA < paisB) {
            paisA += (int) (((double) paisA / 100) * taxaCrescimentoA);
            paisB += (int) (((double) paisB / 100) * taxaCrescimentoB);
            anos++;
        }
        System.out.println("O país A ultrapassará o país B em " + anos + " anos.");
    }
}