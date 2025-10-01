package Arrays;

import java.util.Arrays;

public class RotateMatix {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int [][] arr = new int[mat[0].length][mat.length];

        //rotate this matrix
       // int n = mat.length;
//        for(int i =0; i<n; i++) {
//            for(int j =0; j< n; j++){
//                arr[j][n-1-i] = mat[i][j];
//            }
//
//        }
        //System.out.println();
        //System.out.print(Arrays.deepToString(arr));
        int n = mat.length;
        for(int i =0; i< n; i++){
            int j = n-1-i;

            mat[j][i] = mat[i][j];
        }
        System.out.print(Arrays.deepToString(mat));

    }
}
