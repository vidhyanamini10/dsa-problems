package functions;

import java.util.Scanner;

/**
 * Define a program to find out whether a given number is even or odd.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        evenOrOddCheck(num);
    }

    static void evenOrOddCheck(int num){

       String result =
               (num % 2 == 0) ?  "even number": "odd number";
        System.out.println(result);
    }

}
