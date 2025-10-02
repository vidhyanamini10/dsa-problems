package NeetCode.Arrays;

import java.util.Arrays;

public class ReplaceGreatestRightEle {
    public static void main(String[] args) {
        int [] arr = {17,18,5,4,6,1};
//        for(int i =0; i<arr.length; i++){
//            int max =-1;
//            for(int j =i+1; j< arr.length-1; j++) {
//                max = Math.max(arr[i], arr[j]);
//                arr[i] = max;
//            }
//
//        }
        int max = -1;
        for(int i = arr.length-1;i>=0; i--){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp,max);

        }
        System.out.println(Arrays.toString(arr));
    }
}
