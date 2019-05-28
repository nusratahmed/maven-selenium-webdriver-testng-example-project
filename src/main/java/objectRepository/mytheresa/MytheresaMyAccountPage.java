package objectRepository.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MytheresaMyAccountPage {
	
	WebDriver driver;
	
	@FindBy(linkText="Change Password")
	WebElement change_pass_link;
	
	@FindBy(id="myaccount")
	WebElement myaccount_link;
	
	@FindBy(xpath="//*[@id=\"customer-flyout-navigation\"]/div[2]/ul/li[7]/a")
	WebElement logout;
	
	@FindBy(linkText="my wishlist")
	WebElement my_wishlist;
	
	
	// constructor method
		public MytheresaMyAccountPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		public WebElement changePassLinkPath() {
			return change_pass_link;
		}
		
		public WebElement myaccountLinkPath() {
			return myaccount_link;
		}
		
		public WebElement logoutPath() {
			return logout;
		}
		
		public WebElement wishListLinkPath() {
			return my_wishlist;
		}

}
