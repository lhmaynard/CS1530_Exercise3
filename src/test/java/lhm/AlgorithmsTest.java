import org.junit.Test;
import static org.junit.Assert.*;

import lhm.Driver;

public class AlgorithmsTest{

  @Test
  public void testTriZero(){
    int result = Driver.Tri(0);
    assertEquals(result, 0);
  }

  @Test
  public void testTriSmall(){
    int result = Driver.Tri(10);
    assertEquals(result, 55);
  }

  @Test
  public void testTriLarge(){
    int result = Driver.Tri(100);
    assertEquals(result, 5050);
  }

  @Test
  public void testLazyZero(){
    int result = Driver.Lazy(0);
    assertEquals(result, 1);
  }

  @Test
  public void testLazySmall(){
    int result = Driver.Lazy(10);
    assertEquals(result, 56);
  }

  @Test
  public void testLazyLarge(){
    int result = Driver.Lazy(100);
    assertEquals(result, 5051);
  }

}
