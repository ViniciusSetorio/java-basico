package com.loiane.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {
        /*double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia03 = 33.7;
        double tempDia04 = 34;
        double tempDia05 = 33.1;*/

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 33.1;

        /*System.out.println("Temperatura dia 1: " + temperaturas[0]);
        System.out.println("Tamanho Array: " + temperaturas.length);
        System.out.println("Endereço em memória: " + temperaturas);*/

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura dia "+ (i+1) + ": " + temperaturas[i]);
        }

        for (double temp : temperaturas) {
            System.out.println(temp);
        }
    }
}
