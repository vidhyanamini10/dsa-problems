package JavaBasicProblems;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        // Perimeter Of Parallelogram : P=2(a+b)

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(2 * (a +b));
    }
}
