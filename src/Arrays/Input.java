package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        int [] arr = new int[5]; // array declaration
        Scanner sc = new Scanner(System.in);

//        for(int i =0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
        // 1 way to print elements  for each loop
//        for(int num : arr){ // for every element in the array print the element
//           System.out.print(num + " "); // here num represents the element of the array
//        }
        // 2 way of printing array elements
       // System.out.print(Arrays.toString(arr));

        String [] str = new String[4];
        for(int i =0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
