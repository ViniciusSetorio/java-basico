package com.loiane.cursojava.aula35.labs;

public class Somatorio {

    public static int somatorio(int num) {

        if (num == 1) {
            return 0;
        }

        return num + somatorio(num-1);
    }
}
