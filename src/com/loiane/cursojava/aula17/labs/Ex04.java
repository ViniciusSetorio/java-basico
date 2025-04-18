package com.loiane.cursojava.aula17.labs;

public class Ex04 {
    public static void main(String[] args) {
        int paisA = 80_000;
        int paisB = 200_000;

        int anos = 0;
        while (paisA < paisB) {
            paisA += (paisA / 100) * 3;
            paisB += (int) (((double) paisB / 100) * 1.5);
            anos++;
        }
        System.out.println("O país A ultrapassará o país B em " + anos + " anos.");
    }
}