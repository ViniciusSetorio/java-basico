package com.loiane.cursojava.aula27.labs;

public class JogoDaVelha {
    char[][] jogoDaVelha = new char[3][3];

    String primeiroJogador;
    String segundoJogador;
    String jogadorVencedor = "";

    int linha;
    int coluna;

    boolean jogando = false;
    boolean vitoria = false;

    void iniciarJogo() {
        if (jogando) {
            limparTabuleiro();
            exibirTabuleiro();
        }
    }

    void limparTabuleiro() {
        for (int i = 0; i < jogoDaVelha.length; i++) {
            for (int j = 0; j < jogoDaVelha[i].length; j++) {
                jogoDaVelha[i][j] = ' ';
            }
        }
    }

    void exibirTabuleiro() {
        System.out.println(jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]);
        System.out.println("-----------");
        System.out.println(jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]);
        System.out.println("-----------");
        System.out.println(jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]);
    }

    void jogar(int indice) {
            if (indice % 2 == 0) {
                    jogarJogador1(linha, coluna);

                    exibirTabuleiro();

                    verificarVencedor(primeiroJogador);

                } else {
                    jogarJogador2(linha, coluna);

                    exibirTabuleiro();

                    verificarVencedor(segundoJogador);
                }
    }

    void jogarJogador1(int linha, int coluna) {
        jogoDaVelha[linha][coluna] = 'X';
    }

    void jogarJogador2(int linha, int coluna) {
        jogoDaVelha[linha][coluna] = 'O';
    }

    boolean verificarJogada() {
        if (jogoDaVelha[linha][coluna] != ' ') {
            return true;
        }
        return false;
    }

    void verificarVencedor(String jogador) {
        for (int j = 0; j < jogoDaVelha.length; j++) {
            if (jogoDaVelha[j][0] != ' ' &&
                    jogoDaVelha[j][0] == jogoDaVelha[j][1] &&
                    jogoDaVelha[j][1] == jogoDaVelha[j][2]) {
                jogadorVencedor = jogador;
                vitoria = true;
                break;
            }
        }

        for (int j = 0; j < jogoDaVelha.length; j++) {
            if (jogoDaVelha[0][j] != ' ' &&
                    jogoDaVelha[0][j] == jogoDaVelha[1][j] &&
                    jogoDaVelha[1][j] == jogoDaVelha[2][j]) {
                jogadorVencedor = jogador;
                vitoria = true;
                break;
            }
        }

        if (jogoDaVelha[0][0] != ' ' &&
                jogoDaVelha[0][0] == jogoDaVelha[1][1] &&
                jogoDaVelha[1][1] == jogoDaVelha[2][2]) {
            jogadorVencedor = jogador;
            vitoria = true;
        }

        if (jogoDaVelha[0][2] != ' ' &&
                jogoDaVelha[0][2] == jogoDaVelha[1][1] &&
                jogoDaVelha[1][1] == jogoDaVelha[2][0]) {
            jogadorVencedor = jogador;
            vitoria = true;
        }
    }

    void exibirVencedor() {
        if (jogadorVencedor.equals(primeiroJogador) && vitoria) {
            System.out.println("Parabéns, " + jogadorVencedor + "! Você venceu!");

        } else if (jogadorVencedor.equals(segundoJogador) && vitoria) {
            System.out.println("Parabéns, " + jogadorVencedor + "! Você venceu!");

        } else {
            System.out.println("Empate.");
        }
    }
}