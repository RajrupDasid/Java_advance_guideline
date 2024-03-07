package Loops;

public class Loops {
  public static void main(String[] args) {
    // System.out.println("Hi");
    // loops - for loop, while loop , do while loop,
    // while loop
    // nested while loop
    int i = 1;
    while (i <= 5) {
      System.out.println("Hi" + "  " + i);
      int j = 1;
      while (j <= 3) {
        System.out.println("Hello" + j);
        j++;
      }
      i++;
      System.out.println(j);
    }
    System.out.println(i);
  }

}