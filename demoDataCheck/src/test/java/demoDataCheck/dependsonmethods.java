package demoDataCheck;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class dependsonmethods {
	public class prioprity {
		@Test
		public void create() {
			System.out.println("execute create");
		}
		@Test
		public void Secondcreate() {
			System.out.println("Second execute create");
			SoftAssert s=new SoftAssert();
			s.assertEquals("a", "b");
		}
		@Test(dependsOnMethods  ="create")
		public void modifycreate() {
			System.out.println(" execute modcreate");
		}
		@Test(dependsOnMethods  ="Secondcreate")
		public void deletecreate() {
			System.out.println("execute deletecreate");
		}
	}
	}

