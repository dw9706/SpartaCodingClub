package org.example.java;

public class PracticeJava {
    public static void main(String[] args) {
        print1To100();
        printEvenNumbersFrom1To100();
        gugudan();
    }

    public static void print1To100() {
        // 반복문 연습하기 Part 1
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenNumbersFrom1To100() {
        // 반복문 연습하기 Part 2
        for (int i = 1; i <= 100 ; i++) {
            if(i%2==0) System.out.println(i);
        }
    }

    public static void gugudan() {
        // 반복문 연습하기 Part 3
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
