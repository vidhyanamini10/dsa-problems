package NeetCode.Strings;

public class ScoreOfString {
    public static void main(String[] args) {
        // 1. find the ascii values to the string

        //int a = 'c';
        int temp =0;
        int ans =0;
        String s = "code";
        for(int i =0; i<s.length()-1; i++){
            ans = ans +Math.abs(s.charAt(i) - s.charAt(i+1));

        }
        System.out.println(ans);





    }
}
