package NeetCode.Strings;

import java.util.Arrays;

public class LargestPrefix {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};

        int left = 1;
        for (int j = 0; j < str.length; j++) {

            System.out.println(str[j].charAt(j));
            if(str[j].charAt(left) == str[left].charAt(j)) {
                left ++;
            }

        }


    }
}
