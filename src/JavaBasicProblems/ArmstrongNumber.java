package JavaBasicProblems;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int number = num;
        int noOfDigits = String.valueOf(num).length();

        int ans = 0;
        while (num > 0){
            int temp = num % 10;
            ans += Math.pow(temp,noOfDigits);
            num /= 10;
        }
       if(number == ans){
           System.out.println(number + " Is a Armstrong number");
       }else {
           System.out.println(number + " Is not a Armstrong number");
       }


    }
}
