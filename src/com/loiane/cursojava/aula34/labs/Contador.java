package com.loiane.cursojava.aula34.labs;

public class Contador {
    private static int contador;

    public Contador() {
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }

    public static void zerarContador() {
        Contador.contador = 0;
    }

    public static void incrementarContador() {
        Contador.contador++;
    }

    public static int retornarContador() {
        return contador;
    }
}
