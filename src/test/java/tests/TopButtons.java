package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Revzilla.Objects;
import resources.Base;

public class TopButtons extends Base {
	Properties prop = new Properties();

	@BeforeTest
	public void openBrowser() throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");
		prop.load(fis);
		String baseURL = prop.getProperty("BaseURL");
		driver = initializeDriver();
		driver.get(baseURL);
		Thread.sleep(2000);
	}

	@Test
	public void shippingTo() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.shippingTo().click();
	}


	@Test
	public void lowestPrice() {
		Objects lpObjects = new Objects(driver);
		lpObjects.lowestPrice().click();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
