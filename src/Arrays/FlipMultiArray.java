package Arrays;

import java.util.Arrays;

public class FlipMultiArray {
        public static void main(String[] args) {

            int [][] arr = {{1,1,0},{1,0,1},{0,0,0}};
            int [][] newArr = new int[arr.length][arr[0].length];

            for(int i= 0; i< arr.length; i++){
                int m = arr[i].length;
                for(int j =0; j<m; j++) {
                    // to revere the array from [0,1,2] to
                    // [2,0,1]==>[m-1-j] (3-1-0)=2, (3-1-1)=1, (3-1-2) =0
                     newArr[i][j] = arr[i][m-1-j];
                }

            }
            System.out.println("++++++flip array++++" + Arrays.deepToString(flipArray(newArr)));



        }
        static int[][] flipArray(int[][]newArr){
            for(int i= 0; i< newArr.length; i++){
                for(int j =0; j<newArr[i].length; j++) {
                    newArr[i][j]^=1;
                }
            }
            return newArr;
        }
}
