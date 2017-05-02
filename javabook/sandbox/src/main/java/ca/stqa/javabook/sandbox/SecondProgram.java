package ca.stqa.javabook.sandbox;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by macbook on 4/27/2017.
 */
public class SecondProgram {

  public static void main(String[] args) {

    Point p1 = new Point(2, 1);

    Point p2 = new Point(5, 3);

    System.out.println("Distance between points p1 and p2" + " = " + Point.distance(p1,p2));

  }


}
  /*Point p1 = new Point();
  p1.x = 2;
  p1.y = 1;

  Point p2 = new Point();
  p2.x = 5;
  p2.y = 3;

    System.out.println("Distance between points p1 and p2" + " = " + distance(p1,p2));
}

  public static double distance(Point p1, Point p2){
    return Math.sqrt((p2.y - p1.y)*(p2.y - p1.y) + (p2.x - p1.x)*(p2.x - p1.x));
  }
  */

