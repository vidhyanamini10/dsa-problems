package JavaBasicProblems;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {
        // Area Of Equilateral Triangle : √3/4 × (side)2

        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        double ans = (Math.sqrt(3)/4) * (side * side);
        System.out.println(ans);
    }
}
