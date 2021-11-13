package basePack_01_10_Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pagesPack_01_10_Test.AddToCart;
import pagesPack_01_10_Test.Cart;
import pagesPack_01_10_Test.StoreLogInPage;

public class BaseTest_01_Sep {

	public static WebDriver driver;
	public static WebDriverWait wdwait;
	public ExcelReader1 excelReader1;
	public StoreLogInPage storeLogInPage;
	public AddToCart addToCart;
	public Cart cart;

	public String homeUrl;

	@BeforeClass
	public void setUp() throws IOException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		excelReader1 = new ExcelReader1("C:\\Users\\User\\Desktop\\Test_01-Sep.xlsx");
		homeUrl = excelReader1.getStringData("Sheet1", 1, 0);
		wdwait = new WebDriverWait(driver, 25);
		
		storeLogInPage = new StoreLogInPage(driver, wdwait);
		addToCart = new AddToCart(driver, wdwait);
		cart = new Cart(driver, wdwait);

	}

	@AfterClass
	public void TearDown() {
		driver.close();
		driver.quit();
	}

}
