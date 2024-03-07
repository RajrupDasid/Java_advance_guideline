package Loops;
public class DoWhileLoop{
  public static void main(String args[]){
    int i = 1;
    while (i<=4){
      System.out.println("Hi" + "  " + i);
      int j = 1;
      do{
        System.out.println("Hello" + "  " + j);
        j++;
      }while(j<=3);
      i++;
    }
  }
}