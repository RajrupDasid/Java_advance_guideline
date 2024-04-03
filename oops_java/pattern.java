package oops_java;

public class pattern {
  public static void main(String[] args) {
    int rows = 4;
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= rows - i; j++) {
        System.out.print(" ");
      }
      if (i == 2) {
        System.out.print("\t");
      }
      if (i == 3) {
        System.out.print("\t\t");
      }
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}