package ca.stqa.javabook.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Ang");

    Square s = new Square(5);
    System.out.println("Area of square with side length of " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(4, 6);
    System.out.println("Area of rectangle with sides length of " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }


}
