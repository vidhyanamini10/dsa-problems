package Arrays;

import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int size = removeDup(arr);
        System.out.println(size);

    }

    static int removeDup(int[] arr){
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        return hs.size();
    }
}
