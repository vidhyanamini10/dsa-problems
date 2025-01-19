public class BinarySearch {
//order agnostic binary search
    public int binarySearch(int [] arr, int target){
        int start= 0;
        int end = arr.length-1;
        // optimize way to get the  mid value
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }else if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }else{
                    end= mid-1;
                }
            }else{
                if(target <arr[mid]){
                    start = mid+1;
                }else{
                    end=mid-1;
                }
            }

//            if(target> arr[mid]){ // left side will be updated in asc order array
//               start = mid+1;
//            }else if(target< arr[mid]){ // right side will be updated in asc order array
//                end= mid-1;
//            }else{
//                return mid;
//            }
        }
        return start;

    }

    public static void main(String[] args) {
      BinarySearch bs = new BinarySearch();
      //int ans = bs.binarySearch(new int[]{-19, -20, 0, 7, 9, 19, 38, 89, 99, 106, 305},100);
        int ans = bs.binarySearch(new int[]{100,99,89,79,67,54,43,32,21,11,9},21);
        System.out.println(ans);

    }
}
