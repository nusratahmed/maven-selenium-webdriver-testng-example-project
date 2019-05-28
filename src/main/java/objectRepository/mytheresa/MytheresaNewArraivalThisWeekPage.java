package objectRepository.mytheresa;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MytheresaNewArraivalThisWeekPage {

	WebDriver driver;

	@FindBy(xpath = "//ul[contains(@class,'products-grid')]/li[contains(@class,'item')][3]")
	WebElement root_element;

	@FindBy(xpath = "//div[@id=\"wishlist-addto-overlay-content\"]//a[contains(@class,'btn-cart')]")
	WebElement view_wishlist;

	String heart_button = ".//a[contains(@class,'add-to-wishlist')]";
	String size_select = ".//div/ul[contains(@class,'available-sizes')]/li[2]";
	String add_to_wishlist = ".//button[contains(@class,'btn-wishlist')]";

	// constructor method
	public MytheresaNewArraivalThisWeekPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement selectAsWishPath() {
		return root_element.findElement(By.xpath(heart_button));
	}
	
	public boolean isSizeExist() {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		boolean exists = root_element.findElements(By.xpath(size_select)).size() != 0;
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		return exists;
	}

	public WebElement selectSizePath() {
		return root_element.findElement(By.xpath(size_select));
	}

	public WebElement addToWishListPath() {
		return root_element.findElement(By.xpath(add_to_wishlist));
	}

	public WebElement viewWishListPath() {
		return view_wishlist;
	}

}
