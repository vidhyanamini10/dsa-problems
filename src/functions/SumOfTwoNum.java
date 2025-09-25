package functions;

import java.util.Scanner;

/**
 * Write a program to print the sum of two numbers entered by user by defining your own method.
 */
public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        int num2 = s2.nextInt();
        sumOfTwoNum(num1, num2);

    }

    private static void sumOfTwoNum(int num1, int num2) {
        System.out.println(num1+num2);
    }
}
