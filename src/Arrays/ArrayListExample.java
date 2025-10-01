package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i =0; i < 10; i++){
            list.add(i);
            System.out.println("list.get(i): "+list.get(i));


        }
        list.set(4, 100); // updating 4th index
        list.remove(2); // 2 is removed
        for(int num : list){
            System.out.print(num + " ");
        }
        System.out.println(list.contains(2)); //





    }
}
