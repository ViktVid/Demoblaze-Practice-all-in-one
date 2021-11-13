package pagesPack_01_10_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	WebDriver driver;
	WebElement cart;
	WebElement deleteButton;
	WebDriverWait wdwait;

	public Cart(WebDriver driver, WebDriverWait wdwait) {
		this.driver = driver;
		this.wdwait = wdwait;

	}

	public WebElement getCart() {
		return driver.findElement(By.id("cartur"));
	}

	public void seeCart() {
		this.getCart().click();
	}

	public WebElement deleteButton() {
		return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a"));
	}

	public WebElement samsungInCart() {
		return wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("tbodyid")));
	}

	public String samsungInCart2() {
		wdwait.until(ExpectedConditions.textToBePresentInElement(samsungInCart(), "Samsung galaxy s7"));
		return "";
	}
}
