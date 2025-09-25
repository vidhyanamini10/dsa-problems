package functions;

import java.util.Scanner;

/**
 * A person is eligible to vote if his/her age is greater than or equal to 18.
 * Define a method to find out if he/she is eligible to vote.
 */
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibleToVote(age);
    }

    private static void eligibleToVote(int age) {
        String result = (age >=18) ? "eligible" : "not eligible";
        System.out.println(result);
    }
}
