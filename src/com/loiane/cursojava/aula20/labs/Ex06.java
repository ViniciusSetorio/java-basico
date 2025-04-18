package com.loiane.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        String primeiroJogador;
        String segundoJogador;
        String jogadorVencedor = "";

        int linha = 0;
        int coluna = 0;

        boolean vitoria = false;
        boolean jogando = true;
        String jogarNovamente;

        do {
            System.out.println("Deseja jogar? (S/N)");
            jogarNovamente = scan.next();

            if (jogarNovamente.equalsIgnoreCase("S")) {
                for (int i = 0; i < jogoDaVelha.length; i++) {
                    for (int j = 0; j < jogoDaVelha[i].length; j++) {
                        jogoDaVelha[i][j] = ' ';
                    }
                }
                
                System.out.println("Entre com o nome do primeiro jogador:");
                primeiroJogador = scan.next();

                System.out.println("Entre com o nome do segundo jogador:");
                segundoJogador = scan.next();

                System.out.println(jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]);
                System.out.println("-----------");
                System.out.println(jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]);
                System.out.println("-----------");
                System.out.println(jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]);

                for (int i = 0; i < 9; i++) {
                    if (vitoria) {
                        break;
                    } else {
                        if (i % 2 == 0) {
                            System.out.println(primeiroJogador + " | Entre com a posição que deseja jogar:");
                            linha = scan.nextInt();
                            coluna = scan.nextInt();

                            while (jogoDaVelha[linha][coluna] != ' ') {
                                System.out.println("jogada inválida");

                                System.out.println(primeiroJogador + " | Entre com a posição que deseja jogar:");
                                linha = scan.nextInt();
                                coluna = scan.nextInt();
                            }

                            jogoDaVelha[linha][coluna] = 'X';

                            System.out.println(jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]);
                            System.out.println("-----------");
                            System.out.println(jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]);
                            System.out.println("-----------");
                            System.out.println(jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]);

                            for (int j = 0; j < jogoDaVelha.length; j++) {
                                if (jogoDaVelha[j][0] != ' ' &&
                                        jogoDaVelha[j][0] == jogoDaVelha[j][1] &&
                                        jogoDaVelha[j][1] == jogoDaVelha[j][2]) {
                                    vitoria = true;
                                    jogadorVencedor = primeiroJogador;
                                    break;
                                }
                            }

                            for (int j = 0; j < jogoDaVelha.length; j++) {
                                if (jogoDaVelha[0][j] != ' ' &&
                                        jogoDaVelha[0][j] == jogoDaVelha[1][j] &&
                                        jogoDaVelha[1][j] == jogoDaVelha[2][j]) {
                                    vitoria = true;
                                    jogadorVencedor = primeiroJogador;
                                    break;
                                }
                            }

                            if (jogoDaVelha[0][0] != ' ' &&
                                    jogoDaVelha[0][0] == jogoDaVelha[1][1] &&
                                    jogoDaVelha[1][1] == jogoDaVelha[2][2]) {
                                vitoria = true;
                                jogadorVencedor = primeiroJogador;
                            }

                            if (jogoDaVelha[0][2] != ' ' &&
                                    jogoDaVelha[0][2] == jogoDaVelha[1][1] &&
                                    jogoDaVelha[1][1] == jogoDaVelha[2][0]) {
                                vitoria = true;
                                jogadorVencedor = primeiroJogador;
                            }

                        } else {
                            System.out.println(segundoJogador + " | Entre com a posição que deseja jogar:");
                            linha = scan.nextInt();
                            coluna = scan.nextInt();

                            while (jogoDaVelha[linha][coluna] != ' ') {
                                System.out.println("jogada inválida");

                                System.out.println(segundoJogador + " | Entre com a posição que deseja jogar:");
                                linha = scan.nextInt();
                                coluna = scan.nextInt();
                            }

                            jogoDaVelha[linha][coluna] = 'O';

                            System.out.println(jogoDaVelha[0][0] + " | " + jogoDaVelha[0][1] + " | " + jogoDaVelha[0][2]);
                            System.out.println("-----------");
                            System.out.println(jogoDaVelha[1][0] + " | " + jogoDaVelha[1][1] + " | " + jogoDaVelha[1][2]);
                            System.out.println("-----------");
                            System.out.println(jogoDaVelha[2][0] + " | " + jogoDaVelha[2][1] + " | " + jogoDaVelha[2][2]);

                            for (int j = 0; j < jogoDaVelha.length; j++) {
                                if (jogoDaVelha[j][0] != ' ' &&
                                        jogoDaVelha[j][0] == jogoDaVelha[j][1] &&
                                        jogoDaVelha[j][1] == jogoDaVelha[j][2]) {
                                    vitoria = true;
                                    jogadorVencedor = segundoJogador;
                                    break;
                                }
                            }

                            for (int j = 0; j < jogoDaVelha.length; j++) {
                                if (jogoDaVelha[0][j] != ' ' &&
                                        jogoDaVelha[0][j] == jogoDaVelha[1][j] &&
                                        jogoDaVelha[1][j] == jogoDaVelha[2][j]) {
                                    vitoria = true;
                                    jogadorVencedor = segundoJogador;
                                    break;
                                }
                            }

                            if (jogoDaVelha[0][0] != ' ' &&
                                    jogoDaVelha[0][0] == jogoDaVelha[1][1] &&
                                    jogoDaVelha[1][1] == jogoDaVelha[2][2]) {
                                vitoria = true;
                                jogadorVencedor = segundoJogador;
                            }

                            if (jogoDaVelha[0][2] != ' ' &&
                                    jogoDaVelha[0][2] == jogoDaVelha[1][1] &&
                                    jogoDaVelha[1][1] == jogoDaVelha[2][0]) {
                                vitoria = true;
                                jogadorVencedor = segundoJogador;
                            }
                        }
                    }
                }

                if (jogadorVencedor.equals(primeiroJogador)) {
                    System.out.println("Parabéns, " + jogadorVencedor + "! Você venceu!");

                } else if (jogadorVencedor.equals(segundoJogador)) {
                    System.out.println("Parabéns, " + jogadorVencedor + "! Você venceu!");

                } else {
                    System.out.println("Empate.");
                }

            } else {
                jogando = false;
            }
        } while (jogando);
    }
}