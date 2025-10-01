package Arrays;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayForm {
    public static void main(String[] args) {
        int [] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        //convert this to number?
        int ans =0;
        for(int n : num){
            ans = ans*10 + n;
        }
        System.out.println("before add:" +ans);
        ans = ans+k;
        System.out.println(ans);

        ArrayList<Integer> list = new ArrayList<>();

        while (ans>0){
            list.add(ans %10);
            ans = ans/10;

        }
       Collections.reverse(list);
        System.out.println(list);
    }
}
