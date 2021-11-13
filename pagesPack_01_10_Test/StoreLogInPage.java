package pagesPack_01_10_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoreLogInPage {

	public WebDriver driver;
	WebElement username;
	WebElement password;
	WebElement logInButton;
	WebElement submitLogInButton;
	WebElement logOutButton;
	WebElement successfulLogInText;
	public WebDriverWait wdwait;

	public StoreLogInPage(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogInButton() {
		return driver.findElement(By.id("login2"));
	}

	public WebElement getUsername() {
		return driver.findElement(By.className("form-control"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.id("loginpassword"));
	}

	public WebElement getSubmitLogInButton() {
		// WebElement field = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]"));
		WebElement button = driver.switchTo().parentFrame()
				.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]"));
		return button;
	}

	public WebElement getLogOutButton() {
		return driver.findElement(By.id("logout2"));
	}

	public WebElement getSuccessfulLogInText() {
		return driver.findElement(By.id("nameofuser"));
	}

	public WebDriverWait getWdwait() {
		return wdwait;
	}

/*	public void clickLogIn(String clickLogInButton) {
		this.getLogInButton().click();
	}*/

	public void insertUsername(String usernameData) {
		this.getUsername().clear();
		this.getUsername().sendKeys(usernameData);
	}

	public void insertPassword(String passwordData) {
		this.getPassword().clear();
		this.getPassword().sendKeys(passwordData);
	}

	public void clickSubmit(String clickSubmitButton) {
		this.getSubmitLogInButton().click();
	}

	public void findLogOutButton() {
		wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout2")));

	}

	public String successfulLogInText() {
		wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("nameofuser")));
		return getSubmitLogInButton().getText();
	}

	public String findSuccessfulLogInText() {
		return getSuccessfulLogInText().getText();
	}

}
