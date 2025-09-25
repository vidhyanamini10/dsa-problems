package functions;

public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        swaping(a,b);
        System.out.println(a + " " + b);
    }

    static void swaping(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        //pass-by-value
        // tis change will only be valid only this scope of the function

    }

}
