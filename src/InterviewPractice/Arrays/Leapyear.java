package InterviewPractice.Arrays;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 ==0) || ((year % 4 ==0) && (year % 100!=0))){
            System.out.println(year + " is a leap Year");
        }else {
            System.out.println(year + " not a leap year");
        }
    }

}
