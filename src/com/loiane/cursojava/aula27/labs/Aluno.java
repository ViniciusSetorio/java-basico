package com.loiane.cursojava.aula27.labs;

public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[]nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][3];

    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            System.out.println("Disciplina " + (i+1)+ ": " + nomeDisciplinas[i]);
        }

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina - " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print("Nota " + (j+1) + ": " + notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    void verificarAprovacao(String disciplina) {
        boolean encontrou = false;
        double soma = 0;
        double media;

        for (int i = 0; i < nomeDisciplinas.length; i++) {
            if (disciplina.equals(nomeDisciplinas[i])) {
                encontrou = true;

                for (int j = 0; j < notasDisciplinas[i].length; j++) {
                    soma += notasDisciplinas[i][j];
                }
                media = soma / notasDisciplinas[i].length;
                System.out.println("Média da disciplina " + disciplina + ": " + media);

                if (media >= 7) {
                    System.out.println("Aluno aprovado em " + disciplina);
                } else {
                    System.out.println("Aluno reprovado em " + disciplina);
                }
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Disciplina inválida");
        }
    }
}