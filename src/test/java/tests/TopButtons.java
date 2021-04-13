package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Revzilla.Objects;
import junit.framework.Assert;
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
	public void lowestPrice() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.lowestPrice().click();
		Thread.sleep(2000);

	}
	@Test
	public void selfService() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.closePopup().click();
		driver.switchTo().defaultContent();
		lpObjects.selfService().click();
		Thread.sleep(2000);
	}

	@Test
	public void shippingTo() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.closePopup().click();
		driver.switchTo().defaultContent();
		lpObjects.shippingTo().click();
		Thread.sleep(2000);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
