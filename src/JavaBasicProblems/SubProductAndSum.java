package JavaBasicProblems;

import java.util.Scanner;

public class SubProductAndSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;

        while (n > 0){

            int temp = n % 10;
            sum += temp;
            prod *= temp;
            n = n/10;

        }
        System.out.println(prod - sum);
    }
}
