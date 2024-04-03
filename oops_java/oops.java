package oops_java;

// Object oriented programming
// Object - properties of class
// Class - blueprint
// Properties - data members
// Methods - member functions
// Encapsulation - wrapping of data and methods into a single unit
// Abstraction - hiding of internal details
// Inheritance - inheriting properties and methods from parent class
// Polymorphism - ability to take more than one form
class Addition {
  public int add(int a, int b) {
    return a + b;
  }
}

public class oops {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    // creating object of Addition class
    // only refrence doesnot work in java you have to consume the space so
    // have to define a virtual pointer to the object or the class blueprint
    Addition addition = new Addition(); // consume the space and memory here Addition class is working as object and
                                        // addtion is the reference variable
    System.out.println(addition.add(a, b));

  }
}
