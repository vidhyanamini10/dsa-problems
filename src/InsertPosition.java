public class InsertPosition {
//binary search
    // serch the elemnt in sorted array ,if it founds return the index, else , return where exactly , it would be
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start= mid+1;
            }else if(target < nums[mid]){
                end= mid-1;
            }else{

                return mid;
            }

        }
        return start; // if the ele is not found in the array , will return the index , where it would be
    }

    public static void main(String[] args) {
        InsertPosition insertPosition = new InsertPosition();
        int position = insertPosition.searchInsert(new int[]{1,2,4,6,7,8} ,5);
        System.out.println(position);
    }
}
