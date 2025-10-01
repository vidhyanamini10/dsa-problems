package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaring 2D array
        int [][] arr = new int[3][3];
        //System.out.println(arr.length); // gives the rows length

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }

        }
        // way 1 to print
//        for(int row =0; row < arr.length ; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // way 2
//        for(int [] a : arr){
//            System.out.println(Arrays.toString(a));
//        }
        //way 3
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }


    }
}
