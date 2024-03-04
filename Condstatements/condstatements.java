package Condstatements;

//if else conditional statements
public class condstatements {
    public static void main(String args[]) {
        // if (x > 10 && x <= 20) { // 11- 20
        // System.out.println("Hello");
        // } else {
        // System.out.println("Bye");
        // }
        // if (x > 10 && y > 10)
        // System.out.println(x);
        // else
        // System.out.println(y);
        // int x = 5;
        // int y = 5;
        // int z = 6;

        // if (x > y && x > z) {
        // System.out.println(x);

        // } else if (y > x && y > z) {
        // System.out.println(y);
        // } else {
        // System.out.println(z);
        // }

        int n = 4;
        int result = 0;

        // if (n % 2 == 0)
        // result = 10;
        // else
        // result = 20;

        // System.out.println(result);

        // ternery operator ?:
        result = n % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }
}
