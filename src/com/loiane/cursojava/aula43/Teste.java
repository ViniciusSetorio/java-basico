package com.loiane.cursojava.aula43;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setCurso("ADS");

        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "abc";
        String s2 = "def";

        System.out.println(s1.equals(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("ADS");

        double[] notasAluno1 = {6, 5, 4, 3};
        aluno2.setNotas(notasAluno1);

        System.out.println(aluno.equals(aluno2));
    }
}
