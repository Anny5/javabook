package ca.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ca.stqa.javabook.sandbox.Point;
/**
 * Created by macbook on 5/13/2017.
 */
public class PointTests {

  @Test
  public void testDistance(){
   Point p1 = new Point(2, 1);
   Point p2 = new Point(5, 3);
    Assert.assertEquals(Point.distance(p1, p2), 3.605551275463989);
  }
}
