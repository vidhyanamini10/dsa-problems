import java.util.Arrays;
import java.util.HashMap;

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
    private int[] twoSumM2(int [] nums, int target){
        // using hash map to get time complexity as o(n)
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i =0; i <nums.length; i++){
            int value = target - nums[i]; // sub target - num[3]
            if(hash.containsKey(value)){ // checking if its present in hash map ?
                return new int[]{hash.get(value), i}; //
            }else{
                hash.put(nums[i],i);
            }

        }
        return new int[0];

    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 7, 1, 10, 12, 4 };
        TwoSumProblem1 twoSumProblem1 = new TwoSumProblem1();
        int [] result = twoSumProblem1.twoSumM1(nums,11);
        int [] result2 = twoSumProblem1.twoSumM2(nums,11);

        System.out.println("Brute Froce Algotithm: " +Arrays.toString(result));
        System.out.println("Optimized Algotithm: "+ Arrays.toString(result2));


    }
}