package ru.mirea.task1;

public class Task11 {

    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        //System.out.println("Input a number: ");
        //int num = in.nextInt();

        int [] arr = new int[] {14, 12, 7};

        //1
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        System.out.println(sum);
        sum = 0;

        //2
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i = 0;

        //3
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println(sum);

    }
}

