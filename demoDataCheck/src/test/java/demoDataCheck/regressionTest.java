package demoDataCheck;

import org.testng.annotations.Test;

public class regressionTest  {
	@Test
	public void demo() {
		System.out.println("RegressionTest-1");
	}
@Test//(groups= {"regression2"})[commented to properly understand distrutd parallel execution (testngDistributed.xml)]
public void demo2() {
	System.out.println("regression test -2");
}
@Test
public void demo3() {
	System.out.println("regression test-3");
}
}
//here all the test annotaion will execute one after another in parallel