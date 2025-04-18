package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne:");
        System.out.println("1 - File Duplo\n2 - Alcatra\n3 - Picanha");
        int escolha = scan.nextInt();

        System.out.println("Entre com a quantidade me Kg:");
        double quantidade = scan.nextDouble();

        double precoKg = 0;
        if (escolha == 1) {
            System.out.println(quantidade + "kg - File Duplo");

            if (quantidade < 5) {
                precoKg = 4.90;
            } else {
                precoKg = 5.80;
            }
        } else if (escolha == 2) {
            System.out.println(quantidade + "kg - Alcatra");

            if (quantidade < 5) {
                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }
        } else if (escolha == 3) {
            System.out.println(quantidade + "kg - Picanha");

            if (quantidade < 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }
        }
        double total = quantidade * precoKg;
        System.out.println(quantidade + "kg * " + precoKg + " = " + total);

        System.out.println("Compra no cartão? (1-sim, 2-não)");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) * 5;
            System.out.println("Desconto de " + desconto);
            System.out.println("Valor a pagar: " + (total - desconto));
        } else {
            System.out.println("Valor a pagar: " + total);
        }
    }
}