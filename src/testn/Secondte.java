package testn;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Secondte {

	@Test
	public void third() {
		System.out.println("third");
	}
	
	@Test(timeOut=1000)
	public void fourthna() {
		System.out.println("fourth");
	}
	
	@Test(groups={"Smoke"})
	public void fourthka() {
		System.out.println("fifth");
	}
	
	@BeforeTest
	public void before() {
		System.out.println("before");
	}
	
	@BeforeSuite
	public void besu() {
		System.out.println("beforesuite");
	}
}
