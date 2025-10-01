package Arrays;

import java.util.ArrayList;

public class SortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);
        list.add(5);
         boolean is = isSorted(list);
        System.out.println(is);

    }
    public static boolean isSorted(ArrayList<Integer> nums) {
        int i =0;
        for(i=0; i<nums.size()-1; i++){
            if(nums.get(i) > nums.get(i+1)) return false;
        }
        return true;
    }


}
