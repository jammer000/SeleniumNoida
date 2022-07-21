package Chapter3TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Skipoff {
	public class Pirority {
		@Test (invocationCount = 3)
			public void mango() {
			Reporter.log("mango",true);	
			}
		@Test (priority = -1,invocationCount = 3)
		
		public void fruit() {
			Reporter.log("fruit",true);
		}
		@Test (priority= 1,enabled = false)
		public void food() {
			Reporter.log("food",true);
		}
		
		}

}
