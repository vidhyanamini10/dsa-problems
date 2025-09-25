package JavaBasicProblems;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        //area of triangle , A = ½ (b × h)

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        double ans = 0.5*(b*h);
        System.out.println(ans);


    }
}
