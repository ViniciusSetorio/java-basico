package com.loiane.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i + " ");
            }
        } else if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                System.out.println(i + " ");
            }
        } else {
            System.out.println("Num1 não pode ser igual a Num2.");
        }
    }
}