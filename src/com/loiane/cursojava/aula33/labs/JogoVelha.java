package com.loiane.cursojava.aula33.labs;

public class JogoVelha {

    private char[][] jogoVelha;
    private int jogada;

    public JogoVelha() {
        this.jogoVelha = new char[3][3];
        this.jogada = 1;
    }

    public char[][] getJogoVelha() {
        return jogoVelha;
    }

    public void setJogoVelha(char[][] jogoVelha) {
        this.jogoVelha = jogoVelha;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }

    public boolean vezJogador1() {
        if (this.jogada % 2 == 1) {
            return true;
        }
        return false;
    }

    public boolean validarJogada(int linha, int coluna, char sinal) {

        if (this.jogoVelha[linha][coluna] == 'X' || this.jogoVelha[linha][coluna] == 'O') {
            return false;

        } else {
            this.jogoVelha[linha][coluna] = sinal;
            this.jogada++;
            return true;
        }
    }

    public void imprimirTabuleiro() {

        for (int i = 0; i < this.jogoVelha.length; i++) {
            for (int j = 0; j < this.jogoVelha[i].length; j++) {
                System.out.print(this.jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public boolean verificarGanhador(char sinal) {

        if ((this.jogoVelha[0][0] == sinal && this.jogoVelha[0][1] == sinal && this.jogoVelha[0][2] == sinal) || //linha 1
                (this.jogoVelha[1][0] ==  sinal && this.jogoVelha[1][1] == sinal && this.jogoVelha[1][2] == sinal) || //linha 2
                (this.jogoVelha[2][0] == sinal && this.jogoVelha[2][1] == sinal && this.jogoVelha[2][2] == sinal) || // linha 3
                (this.jogoVelha[0][0] == sinal && this.jogoVelha[1][0] == sinal && this.jogoVelha[2][0] == sinal) || // coluna 1
                (this.jogoVelha[0][1] == sinal && this.jogoVelha[1][1] == sinal && this.jogoVelha[2][1] == sinal) || // coluna 2
                (this.jogoVelha[0][2] == sinal && this.jogoVelha[1][2] == sinal && this.jogoVelha[2][2] == sinal) || // coluna 3
                (this.jogoVelha[0][0] == sinal && this.jogoVelha[1][1] == sinal && this.jogoVelha[2][2] == sinal) || // diagonal
                (this.jogoVelha[0][2] == sinal && this.jogoVelha[1][1] == sinal && this.jogoVelha[2][0] == sinal)) { // diagonal inversa
            return true;
        }
        return false;
    }
}