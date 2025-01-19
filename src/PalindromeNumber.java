import java.util.stream.StreamSupport;

public class PalindromeNumber {


    private boolean palindrome(int num){
        int temp = num;
        int reverse = 0;
      while(temp !=0){
          reverse = (reverse*10)+ temp%10;
          temp = temp/10;
      }
        return (reverse == num);
    }

    private int reverseNumber(int num){
        int temp = num;
        int reverse = 0;
        while(temp!=0){
            reverse = (reverse *10)+ (temp%10);
            temp = temp/10;
        }
        return reverse;
    }


    public static void main(String[] args){
        PalindromeNumber pn = new PalindromeNumber();
        boolean result = pn.palindrome(12021);
        int result2 = pn.reverseNumber(123455);
        System.out.println(result);
        System.out.println(result2);
    }

}
