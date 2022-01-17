package demoDataCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 {
	@Test
	
	public void createCustomer()
	{System.out.println("step1");
	System.out.println("step2");
	Assert.assertNotEquals("a", "b");
	System.out.println("step3");
	System.out.println("step4");
		
	}
	@Test
	public void modifyCustomer()
	{System.out.println("====================================");
	System.out.println("step1");
	System.out.println("step2");
	System.out.println("step3");
		
	}

}
