package JavaBasicProblems;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        // Perimeter Of Circle : C=2πr

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println( 2 * Math.PI * r);


    }
}
