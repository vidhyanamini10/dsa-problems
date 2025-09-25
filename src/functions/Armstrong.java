package functions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        armstrongNum(n);
    }

    private static void armstrongNum(int n) {
        // 153 = 1^3 + 5^3 + 3^3 = 153
        int ans =0;
        int arm = n;
        while(n >0){
         int temp = n % 10;
         ans += (temp * temp * temp);
         n = n / 10;
        }
       String result =
               (ans == arm) ? "Its a armstrong number" : "Its not a armstrong number";
        System.out.println(result);
    }
}
