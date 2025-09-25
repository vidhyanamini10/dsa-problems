package JavaBasicProblems;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        // factors of a number 12 : 1,2,3,4,6,12

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



            for(int i =1 ; i <= n ; i++){
                if(n % i ==0){
                    System.out.println(i);
                }
            }



    }
}
