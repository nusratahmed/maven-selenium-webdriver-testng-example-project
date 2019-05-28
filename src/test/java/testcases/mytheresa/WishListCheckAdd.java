package testcases.mytheresa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import objectRepository.mytheresa.MytheresaHomePage;
import objectRepository.mytheresa.MytheresaMyAccountPage;
import objectRepository.mytheresa.MytheresaNewArraivalThisWeekPage;
import objectRepository.mytheresa.MytheresaWishListPage;

import static variables.mytheresa.UserVariables.*;

public class WishListCheckAdd {

	@Test
	public void WishList() {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		logIn(driver);

		MytheresaWishListPage mwlp = addDeleteItemWishlist(driver);

		louOut(driver, mwlp);

		driver.close();

	}

	private void logIn(WebDriver driver) {
		// log in
		// home page access
		MytheresaHomePage mhp = new MytheresaHomePage(driver);
		Actions a = new Actions(driver);// creating Actions class's object to take actions
		WebElement move = mhp.myAccountLinkPath();// save the path in one web element variable
		a.moveToElement(move).build().perform();// code for mouse hover

		mhp.emailTextPath().sendKeys(USER_EMAIL);
		mhp.passwordTextPath().sendKeys(USER_NEW_PASSWORD);
		mhp.loginButtonPath().click();
	}

	private MytheresaWishListPage addDeleteItemWishlist(WebDriver driver) {
		// add item in wish list
		// My account page access
		MytheresaMyAccountPage map = new MytheresaMyAccountPage(driver);
		map.wishListLinkPath().click();

		// wish list page access
		MytheresaWishListPage mwlp = new MytheresaWishListPage(driver);
		mwlp.newArrivalListPath().click();

		// New arrival this week page access
		MytheresaNewArraivalThisWeekPage mnatwp = new MytheresaNewArraivalThisWeekPage(driver); 
		mnatwp.selectAsWishPath().click();

		if(mnatwp.isSizeExist()) {
			mnatwp.selectSizePath().click();
		}
		
		mnatwp.addToWishListPath().click();
		mnatwp.viewWishListPath().click();
		
		// delete item from wish list
		// wish list page access
		mwlp.removeOptionPath().click();
		return mwlp;
	}

	private void louOut(WebDriver driver, MytheresaWishListPage mwlp) {
		// logout
		// my account page access
		Actions ac = new Actions(driver);// creating Actions class's object to take actions
		WebElement howver = mwlp.myAccountLinkPath();// save the path in one web element variable
		ac.moveToElement(howver).build().perform();// code for mouse hover
		mwlp.logOutLinkPath().click();
	}

}
