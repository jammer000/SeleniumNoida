package Chapter3TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG {
	@Test
	public void tc1() {
		
	Reporter.log("Hello selenium",true);
	Reporter.log("hello java",false);	
	}

}
