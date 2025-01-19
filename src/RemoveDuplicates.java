import java.util.*;

public class RemoveDuplicates {

    public int[] removeDups(int[] nums) {
       int j =1;
       //which iterates all the elements in the array
       for (int i =1; i<nums.length; i++){
           if(nums[i]!=nums[i-1]){ // compare the current ele and previous ele in the array
               nums[j]= nums[i]; // storing the current ele in j
               j++;

           }

       }
//which will print the unique elements
        return Arrays.copyOf(nums,j);

    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
       int [] arr = removeDuplicates.removeDups(new int[]{1, 2, 2, 2, 3, 3, 4, 4, 4});


        System.out.println(Arrays.toString(arr));


    }
}
