package com.loiane.cursojava.aula16;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);
        while (i <= 10) {
            System.out.println("Valor de i: " + i);
            i++;
        }

        do {
            i++;
            System.out.println("O valor de i: " + i);
        } while (i < 15);
    }
}