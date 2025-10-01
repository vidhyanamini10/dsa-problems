package NeetCode.Arrays;

import java.util.Arrays;

public class ConcatinationArray {
    public static void main(String[] args) {
        int [] arr = {1,4,1,2};
        int [] newArr = new int [arr.length *2];

        //concatenate array

        int n = arr.length;
        for(int i=0; i< n; i++){
            newArr[i] = newArr[i+n] = arr[i];

        }
//        for(int i=0; i< n; i++){
//            newArr[i+n] = arr[i];
//
//        }
        System.out.println(Arrays.toString(newArr));

    }
}
