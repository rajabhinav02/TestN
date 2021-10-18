package testn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FouthData {

	@Test(dataProvider= "getData")
	public void testfour(String usr, String pwd) {
		System.out.println("for data fourth");
		System.out.println(usr);
		System.out.println(pwd);
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "firstuser";
		obj[0][1] = "pwd1";
		obj[1][0] = "2nd user";
		obj[1][1] = "pwd2";
		obj[2][0] = "3rd user";
		obj[2][1] = "pwd3";
		
		return obj;
	}
}
