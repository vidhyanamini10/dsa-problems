package functions;

import java.util.Scanner;

/**
 * Write a program to print the factorial of a number by defining a method named 'Factorial'
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);
    }

    private static void factorial(int num) {
        if(num == 0 || num == 1) System.out.println("1");
        int temp =1;
        for(int i = 1; i<=num; i++){

            temp = temp *i;

        }
        System.out.println(temp);

    }
}
