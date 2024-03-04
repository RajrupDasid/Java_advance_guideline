package Type_Conversion;

public class TypeConversion {
    public static void main(String args[]) {
        System.out.println("Type conversion");
        // byte b = 127;
        // int n =b; //type conversion
        // System.out.println(b);
        // System.out.println(n);
        int l = 17;
        byte k = (byte) l; // byte conversion

        /*
         * In the provided code snippet, an integer l with a value of 17 is assigned.
         * Then, the integer l is explicitly cast to a byte k. This is an example of
         * narrowing primitive conversion, where the value of the larger data type (int)
         * is converted to fit into the smaller data type (byte).
         * 
         * However, when narrowing conversions occur, there's a possibility of data loss
         * if the value being converted is outside the range that can be represented by
         * the target data type. In this case, the integer value 17 fits within the
         * range of a byte (-128 to 127), so there is no loss of information.
         */
        System.out.println(k);

        // when byte goes out of range java automatically converted the values into
        // integer

        byte a = 10;
        byte b = 30;

        int result = a * b;
        System.out.println("The result should be a type of int" + " " + result);
    }
}
