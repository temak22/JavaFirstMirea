package ru.mirea.task1;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = in.nextInt();
        System.out.println(Factorial(num));
    }

    static public int Factorial (int x) {
        if (x > 1)
            return Factorial(x-1) * x;
        else
            return 1;
    }
}