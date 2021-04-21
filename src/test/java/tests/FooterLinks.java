package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Revzilla.Objects;
import junit.framework.Assert;
import resources.Base;



public class FooterLinks extends Base {
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

	@Test (priority=1, description="Validates each link from the footer section opening it in a new tab, taking screenshot and returning to main tab")
	public void footerUtility() throws InterruptedException, IOException {

		Objects lpObjects = new Objects(driver);
		int footer = lpObjects.footerUtility().findElements(By.tagName("a")).size();

		for (int i = 1; i < footer; i++) {
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			lpObjects.footerUtility().findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);

			Set<String> handlesSet = driver.getWindowHandles();
			List<String> handlesList = new ArrayList<String>(handlesSet);
			driver.switchTo().window(handlesList.get(1));
			Thread.sleep(1000);
			Assert.assertTrue(lpObjects.homeButton().isDisplayed());
			String tabName = driver.getTitle().trim();
			String splitTabName = tabName.substring(0, 7);
			getScreenshot(splitTabName, driver);
			driver.close();
			driver.switchTo().window(handlesList.get(0));

		}

	}

	@AfterTest
	public void close() {
		driver.quit();
	}
}
