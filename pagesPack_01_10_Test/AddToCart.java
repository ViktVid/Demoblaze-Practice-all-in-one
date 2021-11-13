package pagesPack_01_10_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
		WebDriver driver;
		WebElement clickSamsung;
		WebDriverWait wdwait;
		WebElement addToCart;
		
		public AddToCart(WebDriver driver,WebDriverWait wdwait) {
			this.driver = driver;
			this.wdwait = wdwait;
			
		}

		public WebElement getClickSamsung() {
			return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a"));
		}
		
		public WebElement getAddToCart() {
			return driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));
		
		}
		public void clickSamsungGalaxy() {
			this.getClickSamsung().click();
		}
		
		public void clickAdd(String clickAddButton) {
			this.getAddToCart().click();
			this.getAddToCart().sendKeys(Keys.ENTER);
		}
	

}