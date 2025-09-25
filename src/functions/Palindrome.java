package functions;

import java.util.Scanner;

/**
 *
 Write a function to find if a number is a palindrome or not. Take number as parameter.
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        palindromeCheck(n);
    }

    private static void palindromeCheck(int n) {
        int temp =n; //121
        int rev = 0;
        while(n >0){
            int rem =n % 10;  // 1 , 2 , 1
            rev = (rev * 10) + rem; //1, 12 , 120 +1 = 121
            n = n / 10; //12 , 1
        }
        if (rev == temp){
            System.out.println("palindrome number");
        }else {
            System.out.println("Not a palindrome number");
        }
    }
}
