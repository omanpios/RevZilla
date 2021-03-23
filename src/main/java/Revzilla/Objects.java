package Revzilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {
	public WebDriver driver;

	public Objects(WebDriver driver) {
		this.driver = driver;
	}

	By homeButton = By.xpath("//header/div[1]/section[1]/a[1]");
	By tiresButton = By.xpath("/html/body/header/section/div/nav/ul[1]/li[6]");
	By touringTires = By.cssSelector("a[href='/touring-motorcycle-tires']");
	By widthList = By.cssSelector("select[data-field-name='Width']");
	By aspectRatio = By.cssSelector("select[data-field-name='Aspect Ratio']");
	By rimSize = By.cssSelector("select[data-field-name='Rim Size']");

	public WebElement homeButton() {
		return driver.findElement(homeButton);
	}

	public WebElement tiresButton() {
		return driver.findElement(tiresButton);
	}

	public WebElement touringTires() {
		return driver.findElement(touringTires);
	}

	public WebElement widthList() {
		return driver.findElement(widthList);
	}
	
	public WebElement aspectRatio() {
		return driver.findElement(aspectRatio);
	}
	
	public WebElement rimSize() {
		return driver.findElement(rimSize);
	}
}
