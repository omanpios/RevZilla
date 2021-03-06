package Revzilla;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {
	public WebDriver driver;

	public Objects(WebDriver driver) {
		this.driver = driver;
	}

	By homeButton = By.xpath("//header/div[1]/section[1]/a[1]");
	By tiresButton = By.xpath("/html/body/header/section/div/nav/ul[1]/li[6]");
	By touringTires = By.linkText("Touring");
	By widthList = By.cssSelector("select[data-field-name='Width']");
	By aspectRatio = By.cssSelector("select[data-field-name='Aspect Ratio']");
	By rimSize = By.cssSelector("select[data-field-name='Rim Size']");
	By tireSelection = By.cssSelector("div.product-tile__image-wrapper");
	By sortBy = By.cssSelector("select[data-field-name='Sort by']");
	By shippingTo = By.xpath("//header/div[1]/section[2]/section[1]/section[1]/div[1]/a[1]");
	By lowestPrice = By.xpath("//header/div[1]/section[2]/section[1]/section[1]/div[1]/a[2]");
	By selfService = By.xpath("//header/div[1]/section[2]/section[1]/section[1]/div[1]/a[3]");
	By closePopup = By.className("reveal-header__close");
	By footerUtility = By.className("footer__utility-links");
	

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

	public WebElement tireSelection() {
		return driver.findElement(tireSelection);
	}

	public WebElement sortBy() {
		return driver.findElement(sortBy);
	}

	public WebElement shippingTo() {
		return driver.findElement(shippingTo);
	}

	public WebElement lowestPrice() {
		return driver.findElement(lowestPrice);
	}

	public WebElement selfService() {
		return driver.findElement(selfService);
	}
	public WebElement closePopup() {
		return driver.findElement(closePopup);
	}
	public WebElement footerUtility() {
		return driver.findElement(footerUtility);
	}
	
}
