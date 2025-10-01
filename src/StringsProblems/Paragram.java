package StringsProblems;

public class Paragram {
    public static void main(String[] args) {
        boolean check = checkIfPangram("leetcode");
        System.out.println(check);
    }

    public static boolean checkIfPangram(String sentence) {
        for(int i =0; i<sentence.length(); i++){
            char c = sentence.charAt(i);
            if(c >= 'a' && c<= 'z') return true;
        }
        return false;
    }

}
