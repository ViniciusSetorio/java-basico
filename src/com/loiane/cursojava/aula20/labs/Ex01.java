package com.loiane.cursojava.aula20.labs;

public class Ex01 {
    public static void main(String[] args) {
        int[][] matriz4po4 = new int[4][4];

        for (int i = 0; i < matriz4po4.length; i++) {
            for (int j = 0; j < matriz4po4[i].length; j++) {
                matriz4po4[i][j] = (int) Math.round(Math.random() * 9);
            }
        }

        for (int i = 0; i < matriz4po4.length; i++) {
            for (int j = 0; j < matriz4po4[i].length; j++) {
                System.out.print(matriz4po4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
