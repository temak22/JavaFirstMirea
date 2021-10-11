package ru.mirea.task10;

import java.util.Scanner;

public class Recursion {

    static int a, b;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        a = in.nextInt();
        System.out.println("Input b: ");
        b = in.nextInt();
        System.out.println(withoutOO_task9(a, b));
        System.out.println();

        System.out.println(reverse_task10(1589, 0));
        System.out.println();

        System.out.println(reverse_task11() + " единиц");
        System.out.println();

        reverse_task12(12333);
        System.out.println();

        reverse_task13(1234);
    }

    //R(a,b) = R(a,b-1) + R(a-1, b-1)
    public static int withoutOO_task9(int a, int b){
        if (a > b + 1)
            return 0;
        else if (a == 0 || b == 0)
            return 1;

        return withoutOO_task9(a,b-1) + withoutOO_task9(a-1, b-1);
    }

    public static int reverse_task10(int a, int res){
        if (a == 0)
            return res;
        return reverse_task10( a/10, res*10 + a%10 );
    }

    public static int reverse_task11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 00)
            return 0;
        if (n == 1)
            return reverse_task11() + 1;
        else
            return reverse_task11();
    }

    public static void reverse_task12(int str) {
        int reverse_str = reverse_task10(str, 0);
        if (reverse_str > 0) {
            int temp = reverse_str % 10;
            if (temp % 2 == 1) {
                System.out.println(temp);
                reverse_task12(reverse_str / 10);
            } else {
                reverse_task12(reverse_str / 10);
            }
        }
    }

    public static void reverse_task13(int str) {
        int reverse_str = reverse_task10(str, 0);
        int temp;
        if (reverse_str > 0) {
            temp = reverse_str % 10;
            System.out.println(temp);
            reverse_str /= 100;
            int double_reverse_str = reverse_task10(reverse_str, 0);
            reverse_task13(double_reverse_str);
        }
    }
}
