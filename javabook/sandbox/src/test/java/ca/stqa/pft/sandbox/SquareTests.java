package ca.stqa.pft.sandbox;

import ca.stqa.javabook.sandbox.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

/**Alt + Enter -- set up import
 * Ctrl + Space -- auto-continuing
 * sout
 *
 * Created by macbook on 5/13/2017.
 */
public class SquareTests {

  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(),25.0);
  }
}
