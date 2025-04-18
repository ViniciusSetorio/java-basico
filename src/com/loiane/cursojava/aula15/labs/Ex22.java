package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de morangos em Kg:");
        double qtnMorangos = scan.nextDouble();

        System.out.println("Quantidade de maçãs em Kg:");
        double qtnMacas = scan.nextDouble();

        double qtnCompra = qtnMorangos + qtnMacas;
        double morango = 0;
        double macas = 0;

        double totalCompra = 0;

        if (qtnCompra <= 5) {
            morango = 2.50;
            macas = 1.80;

            totalCompra = (qtnMorangos * morango) + (qtnMacas * macas);
        }

        if (qtnCompra > 5 && qtnCompra <= 8) {
            morango = 2.20;
            macas = 1.50;

            totalCompra = (qtnMorangos * morango) + (qtnMacas * macas);
        }

        if (qtnCompra > 8 || totalCompra > 25.00) {
            morango = 2.20;
            macas = 1.50;

            totalCompra = ((qtnMorangos * morango) + (qtnMacas * macas)) / 0.10;
        }
        System.out.println("Valor a ser pago: " + totalCompra);
    }
}