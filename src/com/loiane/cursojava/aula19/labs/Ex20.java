package com.loiane.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a cotação do dólar em relação ao real:");
        double real = scan.nextDouble();

        double[] cotacaoDolar = new double[20];

        for (int i = 0; i <  cotacaoDolar.length; i++) {
            cotacaoDolar[i] = real * i+1;
            System.out.println(i+1 + " U$ equivalem a R$ " + cotacaoDolar[i]);
        }
    }
}