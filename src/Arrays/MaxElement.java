package Arrays;

import java.util.ArrayList;

public class MaxElement {

    public static void main(String[] args) {
       int [] arr = {2,10,3,7,9,100};

       //maxEle(arr);
       maxElement(arr);
    }
// brute force approch
    private static void maxEle(int[] arr) {
        int ans =0;
        for(int i =0 ; i < arr.length; i++){
            for(int j =1 ; j < arr.length-1; j++){
                 ans = Math.max(arr[i], arr[j]);
            }

        }
        System.out.println(ans);
    }

    static void maxElement(int[] arr){
        int ans =arr[0];
        for(int i =1; i < arr.length; i++){
            ans = Math.max(ans, arr[i]);
        }
        System.out.println(ans);
    }
}
