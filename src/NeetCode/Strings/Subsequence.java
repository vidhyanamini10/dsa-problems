package NeetCode.Strings;

public class Subsequence {
    public static void main(String[] args) {
        String s1 = "aec";
        String s2 = "abcde";

        System.out.println(isSubsequence(s1,s2));


    }

    private  static boolean isSubsequence(String s1, String s2){
        int pointer = 0;
        for(int i =0; i<s2.length(); i++){
            if(pointer < s1.length() && s2.charAt(i) == s1.charAt(pointer)){
                pointer++;
            }
        }
        return pointer == s1.length();
    }
}
