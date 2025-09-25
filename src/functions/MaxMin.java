package functions;

import java.util.Scanner;

/**
 * Define two methods to print the maximum and the minimum number
 * respectively among three numbers entered by the user.
 */

public class MaxMin {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num1 = s1.nextInt();
        Scanner s2 = new Scanner(System.in);
        int num2 = s2.nextInt();
        Scanner s3 = new Scanner(System.in);
        int num3 = s3.nextInt();
        System.out.print("min check ++++++++++   ");
        minCheck(num1,num2,num3);
        System.out.print("max check ------------   ");
       // maxCheck(num1,num2,num3);
        maxCheckUsingTernary(num1,num2,num3);
    }

    static void minCheck(int num1, int num2, int num3) {
        if((num1 < num2) && (num1 < num3)){
            System.out.println(num1);
        }else if((num2 < num3)){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }

    }

    static void maxCheck(int num1, int num2, int num3){
        if((num1 > num2) && (num1 > num3)){
            System.out.println(num1);
        }else if((num2 > num3)){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }

    static void maxCheckUsingTernary(int num1, int num2, int num3){
        int largest = num1 > (num2 > num3 ? num2 : num3) ? num1 : (num2 > num3 ? num2 : num3);
        System.out.println(largest);
    }

}
