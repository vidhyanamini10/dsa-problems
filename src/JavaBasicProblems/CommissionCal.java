package JavaBasicProblems;

import java.util.Scanner;

public class CommissionCal {

    public static void main(String[] args) {
        System.out.println("Enter the sales base : ");
        Scanner sc = new Scanner(System.in);
        int salesBase = sc.nextInt();

        System.out.println("Enter the commission rate : ");
        Scanner sc1 = new Scanner(System.in);
        int commissionRate = sc1.nextInt();

        double commissionEarned = salesBase * (commissionRate * 0.010);
        System.out.println(commissionEarned);


    }
}
