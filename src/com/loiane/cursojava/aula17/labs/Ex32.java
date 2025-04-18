package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "Especificações   Código   Preço\n";
               menu += "Cachorro Quente  100     R$ 1,20\n";
               menu += "Bauru Simples    101     R$ 1,30\n";
               menu += "Bauru com ovo    102     R$ 1,50\n";
               menu += "Hambúrguer       103     R$ 1,20\n";
               menu += "Cheeseburger     104     R$ 1,30\n";
               menu += "Refrigerante     105     R$ 1,00\n";


        int codigo;
        int quantidade;
        double totalGeral = 0;

        boolean comprando = true;

        do {
            System.out.println(menu);

            System.out.println("Entre com o código:");
            codigo = scan.nextInt();

            System.out.println("Entre com a quantidade:");
            quantidade = scan.nextInt();

            switch (codigo) {
                case 100:
                    totalGeral += 1.20 * quantidade;
                    System.out.println("Item: Cachorro Quente");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total pedido: " + (1.20 * quantidade));
                    break;
                case 101:
                    totalGeral += 1.30 * quantidade;
                    System.out.println("Item: Bauru Simples");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total pedido: " + (1.30 * quantidade));
                    break;
                case 102:
                    totalGeral += 1.50 * quantidade;
                    System.out.println("Item: Bauru com ovo");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total pedido: " + (1.50 * quantidade));
                    break;
                case 103:
                    totalGeral += 1.20 * quantidade;
                    System.out.println("Item: Hambúrguer");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total pedido: " + (1.20 * quantidade));
                    break;
                case 104:
                    totalGeral += 1.30 * quantidade;
                    System.out.println("Item: Cheeseburger");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total pedido: " + (1.30 * quantidade));
                    break;
                case 105:
                    totalGeral += 1.00 * quantidade;
                    System.out.println("Item: Refrigerante");
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Total pedido: " + (1.00 * quantidade));
                    break;
                default:
                    System.out.println("Código inválido.");
            }

            System.out.println("Deseja comprar mais alguma coisa?");
            String comprarMais = scan.next();

            if (!comprarMais.equalsIgnoreCase("S")) {
                System.out.println("Total Geral: " + totalGeral);
                comprando = false;
            }
        } while (comprando);
    }
}