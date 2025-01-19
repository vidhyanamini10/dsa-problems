// this program will remove the given all occurance of the element and return the length of an array

import java.util.Arrays;

public class RemoveElement {
    public int[] removeElement(int[] nums, int val) {
        int j=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!= val){
                nums[j]= nums[i];
                j++;
            }
        }


        return Arrays.copyOf(nums, j);
    }

    public static void main(String[] args) {
        RemoveElement removeEle = new RemoveElement();
        int arr[] = removeEle.removeElement(new int[]{1,2,3,3,4,5,5,5,2,1,2,5}, 5);
        //System.out.println(Arrays.toString(arr));
    }
}
