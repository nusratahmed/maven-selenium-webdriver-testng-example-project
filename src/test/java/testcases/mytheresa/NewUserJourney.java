package testcases.mytheresa;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.mytheresa.MytheresaAccountInformationPage;
import objectRepository.mytheresa.MytheresaCreateAccountPage;
import objectRepository.mytheresa.MytheresaHomePage;
import objectRepository.mytheresa.MytheresaMyAccountPage;

import static variables.mytheresa.UserVariables.*;

public class NewUserJourney {

	@Test
	public void accountCreate() {

		BrowserSetting bs = new BrowserSetting();

		WebDriver driver = bs.BrowserSettings();

		createAccount(driver);

		// password change
		// my account page access
		MytheresaMyAccountPage map = new MytheresaMyAccountPage(driver);
		changePassword(driver, map);

		logOut(driver, map);

		driver.close();

	}

	private void createAccount(WebDriver driver) {
		// account create
		// homepage's object access
		MytheresaHomePage mhp = new MytheresaHomePage(driver);
		mhp.myAccountLinkPath().click();

		// account create page's object access
		MytheresaCreateAccountPage mcap = new MytheresaCreateAccountPage(driver);

		mcap.genderButtonPath().click();

		Select s = new Select(mcap.academicTitlePath());
		s.selectByValue("");

		mcap.firstNamePath().sendKeys(USER_FIRST_NAME);
		mcap.lastNamePath().sendKeys(USER_LAST_NAME);
		mcap.emailAddressPath().sendKeys(USER_EMAIL);
		mcap.passwordPath().sendKeys(USER_PASSWORD);
		mcap.confirmPasswordPath().sendKeys(USER_PASSWORD);
		mcap.registrationButtonPath().click();
	}

	private void changePassword(WebDriver driver, MytheresaMyAccountPage map) {
		map.changePassLinkPath().click();

		// account information page access
		MytheresaAccountInformationPage aip = new MytheresaAccountInformationPage(driver);
		aip.currentPassTextPath().sendKeys(USER_PASSWORD);
		aip.newPassTextPath().sendKeys(USER_NEW_PASSWORD);
		aip.confirmPassTextPath().sendKeys(USER_NEW_PASSWORD);
		aip.saveButtonPath().click();
	}

	private void logOut(WebDriver driver, MytheresaMyAccountPage map) {
		// log out
		// my account page access
		Actions a = new Actions(driver);// creating Actions class's object to take actions
		WebElement move = map.myaccountLinkPath();// save the path in one web element variable
		a.moveToElement(move).build().perform();// code for mouse hover
		map.logoutPath().click();
	}

}
