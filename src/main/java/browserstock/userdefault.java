package browserstock;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;

public class userdefault {
	@Given("verify the user default")
	public void verify_the_user_default() throws InterruptedException {
		Thread.sleep(2000);
		pom.tradingroom.click(); 
		Thread.sleep(2000);
		pom.option1.click();
		Thread.sleep(2000);
		pom.tradinguserclear.clear();
		Thread.sleep(2000);
		pom.enterroom1.click();
		Thread.sleep(2000);
		String test1=pom.validatetradingroomuserdefault.getText();

		String name="Enter Username to Continue";
		SoftAssert soft= new SoftAssert(); 
		soft.assertEquals(test1, name);
	
	if(test1.contentEquals("Enter Username to Continue")) {
		System.out.println("popup validated for without enter room");
	}else {
		System.out.println("popup not show for without enter room");
	}

soft.assertAll();
		
	}


}
