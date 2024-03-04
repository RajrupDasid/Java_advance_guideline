package Operators;

public class Logicaloperators {
    public static void main(String args[]) {
        // & will be AND operator
        // | will be OR operator
        // ! will be NOT operator
        int x = 7;
        int y = 5;
        int a = 5;
        int b = 8;

        // boolean result = x < y || a < b || a > 1 || a > b;
        boolean result = a > b;
        System.out.println(!result);
    }
}
