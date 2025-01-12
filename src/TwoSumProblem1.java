import java.util.*;

public class TwoSumProblem1 {
    private int[] twoSumM1(int [] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j=1 ; j< nums.length; j++){
                if(nums[i]+ nums[j] == target){
                  return new int[] {i,j};
                }
            }

        }
        return new int []{};

    }
    // this method will return 2 sum indices
    private int[] twoSumM2(int [] nums, int target){
        // using hash map to get time complexity as o(n)
        HashMap<Integer,Integer> hash = new HashMap<>();
        int count =0;
        for(int i =0; i <nums.length; i++){
            int value = target - nums[i]; // sub target - num[3]

            if(hash.containsKey(value)){ // checking if its present in hash map ?
                return new int[]{hash.get(value), i}; //
                //count = count + hash.get(value);
            }
               hash.put(nums[i],i);
               //hash.put(nums[i],hash.getOrDefault(nums[i],0+ 1));



        }
        return new int[0];


    }
    // this method will return the 2 sum values not indices
    private int[] twoSumM3(int [] nums, int target){
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++){
            for (int j= nums.length-1; j>0; j--){
//                if(nums[i]+nums[j] > target){
//                    j--;
//                }
//                if(nums[i]+nums[j]<target){
//                    i++;
//                }
                if(nums[i]+nums[j]== target){
                    return new int[]{nums[i],nums[j]};
                }

            }

        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 1, 10, 12, 4 };
        TwoSumProblem1 twoSumProblem1 = new TwoSumProblem1();
        int [] result = twoSumProblem1.twoSumM1(nums,11);
        int[] result2 = twoSumProblem1.twoSumM2(nums,11);
        int [] result3 = twoSumProblem1.twoSumM3(nums,11);

       System.out.println("Brute Force Algorithm: " +Arrays.toString(result));
       System.out.println("Optimized Algorithm: "+ Arrays.toString(result2));
       System.out.println("By Sorting the array: "+ Arrays.toString(result3));


    }
}