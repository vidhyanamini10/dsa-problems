package Arrays;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Transpose {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6}
        };
        int [][] newArr = new int[arr[0].length][arr.length];

//        for(int i =0; i< arr.length; i++){
//            for(int j =0; j<arr[i].length; j++){
//                newArr[j][i] = arr[i][j];
//            }
//
//        }
//        System.out.println(Arrays.deepToString(newArr));
        int n = arr.length;
        for(int i =0; i< n-1; i++){
            for(int j =i+1; j<n-1; j++){
                arr[i][j] =arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
