package com.loiane.cursojava.aula33.labs;

public class TesteLampada {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();

        lampada.mostrarEstado();

        lampada.mudarEstado();

        lampada.mostrarEstado();
    }
}
