package Type_Literals;
public class TypeLiterals {
    public static  void main(String args[]) {
        int num1 = 0b101; //type conversion binary code to int
        int num2= 100_00_00_00_0;
        double num3 = 12e10;
        char c = 'a';
        c++; // char can be treated as integer via type literals see the example below
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(c);

    }
}
