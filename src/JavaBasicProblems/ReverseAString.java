package JavaBasicProblems;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String orginalString = s;
        String  rev = "";
        for(int i = s.length() -1 ; i>=0; i--){
            char c = s.charAt(i);
            rev = rev + c ;

        }
        if(orginalString.equals(rev)){
            System.out.println("is a true");
        }else {
            System.out.println("is false");
        }

    }
}
