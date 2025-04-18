package com.loiane.cursojava.aula27.labs;

import java.util.Scanner;

public class TesteJogoDaVelha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

       do {
           System.out.println("Deseja jogar? (S/N)");
           String resposta = scan.next();

           if (resposta.equalsIgnoreCase("S")) {
               System.out.println("Entre com o nome do primeiro jogador:");
               jogoDaVelha.primeiroJogador = scan.next();

               System.out.println("Entre com o nome do segundo jogador:");
               jogoDaVelha.segundoJogador = scan.next();

               jogoDaVelha.vitoria = false;
               jogoDaVelha.jogando = true;
               jogoDaVelha.iniciarJogo();

               for (int i = 0; i < 9; i++) {
                   if (jogoDaVelha.vitoria) {
                       break;
                   }
                   if (i % 2 == 0) {
                       System.out.println(jogoDaVelha.primeiroJogador + " | Entre com a linha e a coluna:");
                       jogoDaVelha.linha = scan.nextInt();
                       jogoDaVelha.coluna = scan.nextInt();

                       while (jogoDaVelha.verificarJogada()) {
                           System.out.println(jogoDaVelha.primeiroJogador + " | Posição ocupada ou inválida. Entre com a linha e a coluna:");
                           jogoDaVelha.linha = scan.nextInt();
                           jogoDaVelha.coluna = scan.nextInt();
                       }
                       jogoDaVelha.jogar(i);
                   } else {
                       System.out.println(jogoDaVelha.segundoJogador + " | Entre com a linha e a coluna:");
                       jogoDaVelha.linha = scan.nextInt();
                       jogoDaVelha.coluna = scan.nextInt();

                       while (jogoDaVelha.verificarJogada()) {
                           System.out.println(jogoDaVelha.segundoJogador + " | Posição ocupada ou inválida. Entre com a linha e a coluna:");
                           jogoDaVelha.linha = scan.nextInt();
                           jogoDaVelha.coluna = scan.nextInt();
                       }
                       jogoDaVelha.jogar(i);
                   }
               }
               jogoDaVelha.exibirVencedor();

           } else {
               jogoDaVelha.jogando = false;
           }
       } while (jogoDaVelha.jogando);
    }
}