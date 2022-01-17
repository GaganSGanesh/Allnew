package demoDataCheck;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void createCustomer()
	{System.out.println("step1");
	System.out.println("step2");
	Assert.assertEquals("A", "B");//This statement will compare A with B and if it is not equal the "step3" and "step4" will not execute
	System.out.println("step3");//if in assert we enter->("A","A"), then"step3" and "step4" will execute
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
