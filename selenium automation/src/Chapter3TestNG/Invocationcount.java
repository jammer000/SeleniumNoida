package Chapter3TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {
	
	public class Pirority {
		@Test (invocationCount = 3)
			public void mango() {
			Reporter.log("mango",true);	
			}
		@Test (priority = -1,invocationCount = 3)
		
		public void fruit() {
			Reporter.log("fruit",true);
		}
		@Test(priority= 1)
		public void food() {
			Reporter.log("food",true);
		}
		
		}
}
