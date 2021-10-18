package testn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTe {

	@BeforeClass
	public void BefCl() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void AfCl() {
		System.out.println("After class");
	}
	
	@Test(groups={"Smoke"})
	public void Testone() {

		System.out.println("first");
		
	}
	
	@Parameters({"URL", "tes"})
	@Test 
	public void Testtwo(String urlname, String testname) {
		System.out.println("second");
		System.out.println(urlname);
		System.out.println(testname);
	}
	
	@Test(dependsOnMethods= {"Testone"})
	public void Atest() {
		System.out.println("alpha a");
	}
	
	@Test(enabled=false)
	public void Aatest() {
		System.out.println("alpha a two");
	}
	
	@AfterTest
	public void After() {
		System.out.println("after");
	}
	
	@AfterSuite
	public void afsu() {
		System.out.println("aftersuite");
	}
	
	@BeforeMethod
	public void bemet() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afmet() {
		System.out.println("After method");
	}
	
}
