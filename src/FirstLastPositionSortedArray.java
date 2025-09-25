import java.util.Arrays;

public class FirstLastPositionSortedArray {
    //need to written the first and last position of an target index in given sorted array
//brute force approch tp= o(n)

    public int [] firstLastPosition(int [] nums, int target){

        int [] ans = {-1,-1};
        int start = search(nums,target,true);
        int last = search(nums,target,false);

        ans [0]= start;
        ans [1] = last;
        return ans;

    }
    public int search(int [] nums, int target, boolean firstSearchIndex) {

        int ans = -1;
        int start =0;
        int end = nums.length-1;

        while(start <=end ){

            int mid = start + (end-start)/2;

            if (target < nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid +1;
            }else {
                ans = mid;
                if(firstSearchIndex){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }


    // optimized solution with binary search tp = o(log n)

    public static void main(String[] args) {
        FirstLastPositionSortedArray fp = new FirstLastPositionSortedArray();
        int [] value = fp.firstLastPosition(new int[]{7,7,8,8,8,8,8,10}, 8);

        System.out.println(Arrays.toString(value));
    }

}
