package ca.stqa.javabook.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Ang");

    double l = 5;
    System.out.println("Area of square with side length of " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Area of rectangle with sides length of " + a + " and " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}
