package JavaBasicProblems;

import java.util.Scanner;

public class VowelsOrConstants {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().toLowerCase().charAt(0);


            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println("it contains vowels");
            }else if (c >= 'a' && c <='z'){
                System.out.println("it contains constants");
            }else {
                System.out.println("Input is not a valid alphabet.");
            }
        }

}
