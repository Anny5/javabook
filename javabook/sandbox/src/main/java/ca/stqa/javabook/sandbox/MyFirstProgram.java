package ca.stqa.javabook.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    system("is working");
    system("is sleeping");
    system("is running");

    double l = 5;
    System.out.println("Area of square of " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Area of rectangle with sides " + a + " and " + b + " = " + area(a, b));
  }

  public static void system(String somebody) {
    System.out.println("The system " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b){
    return a * b;
  }
}