package HomeWo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFail {
	@Test
  public void Testf() {
		System.out.println("Hello");
		Assert.fail("Null");
		
	  
  }
}
