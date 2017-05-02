package ca.stqa.javabook.sandbox;

/**
 * Created by macbook on 4/26/2017.
 */
public class Rectangle {

  public double a;
  public double b;

  public Rectangle(double a, double b){
    this.a = a;
    this.b = b;
  }

  public double area() {
    return this.a * this.b;
  }
}
