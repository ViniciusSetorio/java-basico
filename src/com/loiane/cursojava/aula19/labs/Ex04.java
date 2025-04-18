package com.loiane.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###.##");

        int[] A = new int[15];
        double[] B = new double[A.length];

        int valor;
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o valor de A do índice " + i + ": ");
            valor = scan.nextInt();
            A[i] = valor;
        }

        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }

        for (double element: B) {
            System.out.println(df.format(element));
        }
    }
}
