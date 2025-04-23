package com.loiane.cursojava.aula45;

public class Teste2 {

    public static void main(String[] args) {

        Object obj = obterString();
        String str = (String) obj; //downcasting

        Object obj2 = "minha String"; //upcasting
        String str2 = (String) obj2; //downcasting

        Object obj3 = new Object();
        String str3 = (String) obj3;

        Object obj4 = obterInt();
        String str4 = (String) obj4;
    }

    public static String obterString() {
        return "minha String";
    }

    public static int obterInt() {
        return 1;
    }
}
