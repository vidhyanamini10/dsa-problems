package JavaBasicProblems;


import java.util.Scanner;


import static java.lang.Math.round;

public class AreaOfCircle {
    public static void main(String[] args) {
        // formula for area of circle = pie * r2

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double ans = round(Math.PI * (r*r))  ;
        System.out.println(ans);

    }
}
