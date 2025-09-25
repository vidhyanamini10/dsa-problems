package JavaBasicProblems;

import java.lang.reflect.Array;

public class AverageOfNnumbers {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int temp =0;
        int ans = 0;
        for(int i =0; i<= arr.length -1; i++){
            temp = temp + arr[i];
            ans = temp /arr.length;

        }
        System.out.println(ans);

    }
}
