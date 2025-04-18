package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o preço de três produtos:");
        double preco1 = scan.nextDouble();
        double preco2 = scan.nextDouble();
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Você deve comprar o produto de valor " + preco1);
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Você deve comprar o produto de valor " + preco2);
        } else {
            System.out.println("Você deve comprar o produto de valor " + preco3);
        }
    }
}