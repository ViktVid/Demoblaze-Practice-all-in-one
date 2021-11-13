package testPack_01_10_Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePack_01_10_Test.BaseTest_01_Sep;


public class Tests_01_Sep extends BaseTest_01_Sep {

	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(homeUrl);
	}
	

	@Test (priority = 10)
	public void successfulLogIn() throws InterruptedException {
		storeLogInPage.getLogInButton().click();
		String username = excelReader1.getStringData("Sheet1", 1, 1);
		String password = excelReader1.getStringData("Sheet1", 1, 2);
		storeLogInPage.getLogInButton().click();
		Thread.sleep(500);
		storeLogInPage.insertUsername(username);
		storeLogInPage.insertPassword(password);
		Thread.sleep(500);
		storeLogInPage.getSubmitLogInButton();
		
		Assert.assertTrue(storeLogInPage.getLogOutButton().isDisplayed());
	}
	
/*	@Test (priority = 20)
	public void incorrectUsername() {
		for (int i = 1; i < xcelReader.getLastRowNumber(); i++) {
			String username = xcelReader.getStringData("Sheet1", i, 1);
			String password = xcelReader.getStringData("Sheet1", 1, 2);
			storeLogInPage.getLogInButton().click();
			storeLogInPage.insertUsername(username);
			storeLogInPage.insertPassword(password);
			storeLogInPage.getSubmitLogInButton();	
			
		}
		
		Assert.assertFalse(storeLogInPage.getLogOutButton().isDisplayed());
	}
	
	@Test (priority = 30)
	public void incorrectPassword() {
		for (int i = 1; i < xcelReader.getLastRowNumber(); i++) {
			String username = xcelReader.getStringData("Sheet1", 1, 1);
			String password = xcelReader.getStringData("Sheet1", i, 2);
			storeLogInPage.getLogInButton().click();
			storeLogInPage.insertUsername(username);
			storeLogInPage.insertPassword(password);
			storeLogInPage.getSubmitLogInButton();	
			
		}
		
		Assert.assertFalse(storeLogInPage.getLogOutButton().isDisplayed());
	}*/
	
		@AfterMethod
	public void pageCleanUp() {
		storeLogInPage.getLogOutButton().click();
		driver.manage().deleteAllCookies();
	}
	
}
