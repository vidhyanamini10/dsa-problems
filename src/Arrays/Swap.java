package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 4,6, 9, 10};
       swapTwoNumber(arr, 1, 3);

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr) {
        //swap first and end number the inc first , dec end
        int first = 0;
        int last = arr.length-1;
        while (first < last){
            swapTwoNumber(arr, first, last);
            first++;
            last--;
        }
       // System.out.println(Arrays.toString(arr));
    }

     static void swapTwoNumber(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        //System.out.println(arr[index1] + " "+  arr[index2]);
    }

    //reverse the array
}
