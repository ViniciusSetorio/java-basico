package com.loiane.cursojava.aula42;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Constantes.URL_BLOG);
        Constantes.URL_BLOG = "http://qualqueroutrosite.com";
        System.out.println(Constantes.URL_BLOG);

        /*Constantes.CURSO_COMPLETO = "123456";*/

        final int num = 1;
        //num += num + 1;
        System.out.println(num);
   }
}