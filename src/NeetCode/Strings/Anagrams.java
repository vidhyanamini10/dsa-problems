package NeetCode.Strings;

import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        System.out.println(anaCheck(s,t));

    }
    private static Boolean anaCheck(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // add char to map and inc by 1 if its repeat
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            // if same value in t , would be sub by 1 if
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) -1);

        }

        for(int count : map.values()) {
            if (count != 0) return false;

        }
        return true;

    }

}
