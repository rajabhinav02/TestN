package testn;

import org.testng.annotations.Test;

public class Thirdte {
	
	@Test
	public void thirdclass() {
		System.out.println("thirdclass");
	}

	
	@Test(groups={"Smoke"})
	public void thirdclasss() {
		System.out.println("thirdclasssecondm");
	}
	
}
