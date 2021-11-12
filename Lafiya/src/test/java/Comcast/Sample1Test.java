package Comcast;

import org.testng.annotations.Test;

public class Sample1Test {
	@Test
	public void samplle()
	{
		String Browser = System.getProperty("browser");
		System.out.println(Browser);
	}
}
