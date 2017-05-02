package ca.stqa.javabook.sandbox;

/**
 * Created by macbook on 4/26/2017.
 */
public class Square {

  public double l;
  
  public Square(double l){
    this.l = l;
  }

  public double area() {
    return this.l * this.l;
  }
}
