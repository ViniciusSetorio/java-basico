package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o valor do pão:");
        double valor = scan.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços:");
        System.out.println("Valor do pão: " + valor);
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - R$ " + (valor * i));
        }
    }
}