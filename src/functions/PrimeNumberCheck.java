package functions;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        primeCheck(num);
    }


    static void primeCheck(int n){
        if(n <=1 ) System.out.println("its not a valid number");

        int c = 2;
        while(c * c <= n){
            if(n % c ==0){
                System.out.println("Its not a prime number");
                return;
            }
            c++;

        }

       if(c * c > n){
           System.out.println("Its a prime number");
       }
    }

}
