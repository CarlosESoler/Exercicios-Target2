package org.example;

public class Exercicios {
    public static String fibonacci(int num) {
        int a = 0, b = 1, c = 1;
        boolean pertence = false;

        while(c <= num){
            if (c == num) {
                pertence = true;
                break;
            }
            a = b;
            b = c;
            c = a + b;
        }
        if (pertence) {
            return "Pertence";
        }
        return "Não pertence";
    }
    public static String reverseString(String stringReverter) {
        String revertida = "";
        for (int i = stringReverter.length() - 1; i >= 0; i--) {
            revertida += stringReverter.charAt(i);
        }
        return revertida;
    }
}
