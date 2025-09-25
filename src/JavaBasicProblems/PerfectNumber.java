package JavaBasicProblems;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        for(int i =1 ; i < n; i++){
           if (n % i ==0){
               temp = temp + i;
           }
        }
        if (n == temp){
            System.out.println("perfect number");
        }else {
            System.out.println("not a perfect number");
        }
    }
}
