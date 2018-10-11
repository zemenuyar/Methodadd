package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int total = 0;

        Scanner num = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int sum = num.nextInt();
            total = total + sum;

        }
        System.out.println(total);
    }
}
