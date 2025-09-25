package InterviewPractice.Arrays;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int a = 10, b = 20;
        SwapTwoNumber swap = new SwapTwoNumber();
        swap.swapWithTemp(a,b);
        swap.swapWithoutTemp(a,b);

    }
    // swap with temp variable
    private void swapWithTemp(int a , int b){

        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a: "+a + ", "+"b: " + b);
    }

    private void swapWithoutTemp(int a, int b){
        a = a + b; // 10 + 20 = 30
        b = a - b; // 30 - 20 = 10
        a = a - b ; // 30 - 10 = 20
        System.out.println("a : " + a + ", "+  "b : " + b);
    }

}
