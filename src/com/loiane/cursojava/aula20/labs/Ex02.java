package com.loiane.cursojava.aula20.labs;

public class Ex02 {
    public static void main(String[] args) {
        int[][] matriz10po10 = new int[10][10];

        int menorValorL5= Integer.MAX_VALUE;
        int maiorValorL5= Integer.MIN_VALUE;

        int menorValorC7= Integer.MAX_VALUE;
        int maiorValorC7= Integer.MIN_VALUE;

        for (int i = 0; i < matriz10po10.length; i++) {
            for (int j = 0; j < matriz10po10[i].length; j++) {
                matriz10po10[i][j] = (int) Math.round(Math.random() * 9);
            }
        }

        System.out.println("Matriz");
        for (int i = 0; i < matriz10po10.length; i++) {
            for (int j = 0; j < matriz10po10[i].length; j++) {
                System.out.print(matriz10po10[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matriz10po10.length; i++) {
            for (int j = 0; j < matriz10po10[i].length; j++) {
                if (i == 4) {
                    if (matriz10po10[i][j] < menorValorL5) {
                        menorValorL5 = matriz10po10[i][j];
                    }

                    if (matriz10po10[i][j] > maiorValorL5){
                        maiorValorL5 = matriz10po10[i][j];
                    }
                }

                if (j == 6) {
                    if (matriz10po10[i][j] < menorValorC7) {
                        menorValorC7 = matriz10po10[i][j];
                    } else if (matriz10po10[i][j] > maiorValorC7){
                        maiorValorC7 = matriz10po10[i][j];
                    }
                }
            }
        }

        System.out.println("Maior valor da linha 5: " + maiorValorL5);
        System.out.println("Menor valor da linha 5: " + menorValorL5);

        System.out.println("Maior valor da coluna 7: " + maiorValorC7);
        System.out.println("Menor valor da coluna 7: " + menorValorC7);
    }
}
