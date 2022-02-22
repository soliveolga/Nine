package com.nine.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Размер массива: ");
        int size = input.nextInt();

        double [] massive = new double[size];
        System.out.println("Данные для массива: ");

        double sum = 0;
        for(int i = 0; i < size; i++){
            massive[i] = input.nextInt();
            sum += massive[i];
        }
        double average = sum/size;
        for (int a = 0; a < size; a++) {
            massive[a] = massive[a] * average;
            System.out.println(massive[a]);
        }
    }
}
