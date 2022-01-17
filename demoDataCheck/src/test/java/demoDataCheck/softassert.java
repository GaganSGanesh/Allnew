package demoDataCheck;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	@Test
	public void sof()
	{
		System.out.println("step1");
		System.out.println("step2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("A", "B");
		System.out.println("step3");
		s.assertEquals("x", "y");
		System.out.println("step4");
		
	}
	@Test
	public void soff() {
		System.out.println("=====================================================");
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		System.out.println("step4");
		
	}
	

}
