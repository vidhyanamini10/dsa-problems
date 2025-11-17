package NeetCode.Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int [] arr = {1,0,1,1,0,1};
        int max =0;
        int count =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==0) count =0;
            if(arr[i] ==1) count ++;
            max = Math.max(count,max);

        }
        System.out.println(max);
    }
}
