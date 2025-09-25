package JavaBasicProblems;

import java.util.Scanner;

public class Discountproduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: " );
        int amount = sc.nextInt();

        double savings = amount * 0.20;
        System.out.println("Total Amount is : " + (amount - savings));

    }
}
