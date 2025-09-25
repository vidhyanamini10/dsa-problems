package JavaBasicProblems;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class VolumeOfCone {

    public static void main(String[] args) {
        // Volume Of Cone : V=πr2h/3

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        double v = Math.PI * (r * r)* h /3;
        System.out.println(v);
    }
}
