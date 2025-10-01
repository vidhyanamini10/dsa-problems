package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MutiDimArrayList {
    public static void main(String[] args) {
        // multi dimensional array list
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize 3 empty lists in a list
        for(int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
        // adding elements to the list
        for(int i =0 ; i < 3; i++){
            for(int j =0; j <list.get(i).size(); j++){
                list.get(i).add(in.nextInt()); // get(i) will get the row number then adds the elements

            }
        }
        System.out.println(list);


    }
}
