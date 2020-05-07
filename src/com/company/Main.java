package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Введите числа в массив: ");
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            x[i] = in.nextInt();
        }
        for (int i = x.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (x[j] > x[j + 1]) {
                    int tmp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = tmp;
                }
            }
        }
        System.out.println("Массив в порядке возрастания: ");
        for (int i =0; i < x.length; i ++){
            System.out.println(" " + x[i]);
        }
    }
}
