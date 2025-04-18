package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo de combustível(A-álcool, G-gasolina) e a quantidade em litros:");
        String tipoCombustivel = scan.next();
        int qtnLitros = scan.nextInt();

        double gasolina = 6.32;
        double alcool = 4.51;

        double precoFinal =  0;
        switch (tipoCombustivel) {
            case "A":
                if (qtnLitros <= 20) {
                    precoFinal = (qtnLitros * alcool) / 0.03;
                } else {
                    precoFinal = (qtnLitros * alcool) / 0.05;
                }
                break;
            case "G":
                if (qtnLitros <= 20) {
                    precoFinal = (qtnLitros * gasolina) / 0.04;
                } else {
                    precoFinal = (qtnLitros * gasolina) / 0.06;
                }
                break;
        }
        System.out.println("Preço Final: " + precoFinal);
    }
}
