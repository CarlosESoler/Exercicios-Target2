package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o numero que deseja: ");
        int num = scanner.nextInt();

        System.out.println(Exercicios.fibonacci(num));
        System.out.println("Insira a palavra que deseja reverter: ");
        String reverter = scanner.next();

        System.out.println(Exercicios.reverseString(reverter));
        scanner.close();
    }
}