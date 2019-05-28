package objectRepository.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MytheresaWishListPage {

	WebDriver driver;

	@FindBy(xpath = "//div[@id=\"wishlist-item-list\"]/div/div/a")
	WebElement new_arraival;
	
	@FindBy(xpath="//div[contains(@class,'button-wrapper')]/a[contains(@class,'wishlist-delete')]")
	WebElement remove;
	
	@FindBy(id="myaccount")
	WebElement myaccount_link;
	
	@FindBy(xpath="//*[@id=\"customer-flyout-navigation\"]//li[@class=\"last\"]/a")
	WebElement logout;

	// constructor method
	public MytheresaWishListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement newArrivalListPath() {
		return new_arraival;
	}
	
	public WebElement removeOptionPath() {
		return remove;
	}
	
	public WebElement myAccountLinkPath() {
		return myaccount_link;
	}
	
	public WebElement logOutLinkPath() {
		return logout;
	}

}
