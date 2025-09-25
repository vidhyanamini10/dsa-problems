package JavaBasicProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int orginalNumber = num;
        int rev =0;
        while(num >0){
            int temp = num % 10;
            rev = (rev * 10) + temp;
            num /=10;
        }
        if(orginalNumber == rev){
            System.out.println(" is palindrome");
        }else{
            System.out.println("is not a palindrome");
        }
    }
}
