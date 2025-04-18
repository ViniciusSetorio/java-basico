package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de CD's:");
        int qtnCds = scan.nextInt();

        double valor;
        double valorTotal = 0;
        double mediaPorCd = 0;

        for (int i = 1; i <= qtnCds; i++) {
            System.out.println("CD " + i + ":");
            valor = scan.nextDouble();
            valorTotal += valor;
        }
        mediaPorCd = valorTotal / qtnCds;
        System.out.println("Valor total: " + valorTotal);
        System.out.println("Média por CD: " + mediaPorCd);
    }
}