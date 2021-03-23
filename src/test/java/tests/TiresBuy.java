package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Revzilla.Objects;
import resources.Base;

public class TiresBuy extends Base {
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
	public void tiresButton() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		Actions action = new Actions(driver);
		action.moveToElement(lpObjects.tiresButton()).build().perform();
		Thread.sleep(2000);
		
	}
	@Test
	public void touringTires() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.touringTires().click();
		//lpObjects.widthList().click();
		Thread.sleep(2000);
		Select width = new Select (lpObjects.widthList());
		Select aspect = new Select (lpObjects.aspectRatio());
		Select rim = new Select (lpObjects.rimSize());
		width.selectByVisibleText("150");
		aspect.selectByVisibleText("70");
		rim.selectByVisibleText("17");
	}
}
