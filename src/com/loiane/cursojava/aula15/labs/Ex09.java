package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com três números:");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            System.out.println(num3 + " - " + num2 + " - " + num1);

        } if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            System.out.println(num2 + " - " + num3 + " - " + num1);

        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            System.out.println(num3 + " - " + num1 + " - " + num2);

        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            System.out.println(num1 + " - " + num3 + " - " + num2);

        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            System.out.println(num2 + " - " + num1 + " - " + num3);

        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
    }
}