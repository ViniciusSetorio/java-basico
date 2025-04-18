package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double preco = 0;
        double total = 0;
        boolean aberto = true;

        do {
            System.out.println("Lojas Tabajara");

            for (int i = 1; i != 0; i++) {
                System.out.print("Preço do Produto " + i + ": R$ ");
                preco = scan.nextDouble();
                total += preco;
                if (preco == 0) break;
            }

            System.out.println("Total: " + total);
            System.out.println("Forneça um valor:");
            double valorFornecido = scan.nextDouble();

            if (valorFornecido < preco) {
                while (valorFornecido < preco) {
                    System.out.println("Forneça um valor:");
                    valorFornecido = scan.nextDouble();
                }
            }
            System.out.println("Troco: " + (valorFornecido - total));

            System.out.println("Deseja continuar comprando?");
            String comprarNovamente = scan.next();

            if (comprarNovamente.equalsIgnoreCase("N")) {
                aberto = false;
            }
        } while (aberto);
    }
}