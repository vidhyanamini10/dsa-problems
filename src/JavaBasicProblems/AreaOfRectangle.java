package JavaBasicProblems;

import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        // area of rectangle : A = L × W,

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.println(l*w);
    }
}
