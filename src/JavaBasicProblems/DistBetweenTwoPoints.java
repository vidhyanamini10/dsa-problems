package JavaBasicProblems;

import java.util.Scanner;

public class DistBetweenTwoPoints {

    public static void main(String[] args) {
        System.out.println("Enter x1 co-ordinate: ");
        Scanner sc1 = new Scanner(System.in);
        int x1 = sc1.nextInt();

        System.out.println("Enter x2 co-ordinate: ");
        Scanner sc2 = new Scanner(System.in);
        int x2 = sc2.nextInt();

        System.out.println("Enter y1 co-ordinate: ");
        Scanner sc3 = new Scanner(System.in);
        int y1 = sc3.nextInt();

        System.out.println("Enter y2 co-ordinate: ");
        Scanner sc4 = new Scanner(System.in);
        int y2 = sc4.nextInt();

        double distance = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 -y1) * (y2 -y1)));
        System.out.println(distance);




    }
}
