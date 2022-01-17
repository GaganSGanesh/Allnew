package demoDataCheck;

import org.testng.annotations.Test;

public class smoke {
	@Test//(groups= {"smoke"})[commented to properly understand distrutd parallel execution (testngDistributed.xml)]
	public void demo() {
	System.out.println("Smoke Test-1");
}
	@Test//(groups= {"smoke"})
	public void demo2()
	{
		System.out.println("Smoke TEST -2");
	}
@Test//(groups= {"smoke3"})
public void demo3()
{
	System.out.println("smoke Test-3");
	}
}
