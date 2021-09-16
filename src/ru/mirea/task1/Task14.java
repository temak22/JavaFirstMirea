package ru.mirea.task1;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        //System.out.println("Input a number: ");
        //int num = in.nextInt();

        int[] arr = new int[10];

        int min = 1000;
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
            if (arr[i] < min)
                min = arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
