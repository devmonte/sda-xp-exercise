package com.sdacademy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Enter first numer");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter next number");
        int b = scanner.nextInt();
        System.out.println("Enter for selection: 1 for addition, 2 for substruction, 3 for multiplication, 4 for division");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                System.out.println(addInt(a, b));
            case 2:
                System.out.println(subInt(a, b));
            case 3:
                System.out.println(multInt(a, b));
            case 4:
                System.out.println(divInt(a, b));
        }
    }

    public static int addInt(int a, int b) {
        int c = 0;
        return c = a + b;
    }

    public static int subInt(int a, int b) {
        int c = 0;
        return c = a - b;
    }

    public static int multInt(int a, int b) {
        int c = 0;
        return c = a * b;
    }

    public static int divInt(int a, int b) {
        int c = 0;
        return c = a / b;
    }
}
