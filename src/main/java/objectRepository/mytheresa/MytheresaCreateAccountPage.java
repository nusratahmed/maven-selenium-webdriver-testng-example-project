package objectRepository.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MytheresaCreateAccountPage {

	WebDriver driver;

	@FindBy(id = "prefix_Mrs.")
	WebElement mrsradio_button;

	@FindBy(id = "suffix")
	WebElement academic_title;

	@FindBy(id = "firstname")
	WebElement firstname;

	@FindBy(id = "lastname")
	WebElement lastname;

	@FindBy(id = "email_address")
	WebElement email;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "confirmation")
	WebElement confirmation;

	@FindBy(xpath = "//*[@id=\"form-validate\"]/div[2]/button")
	WebElement register;

	// constructor method
	public MytheresaCreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement genderButtonPath() {
		return mrsradio_button;
	}

	public WebElement academicTitlePath() {
		return academic_title;
	}

	public WebElement firstNamePath() {
		return firstname;
	}

	public WebElement lastNamePath() {
		return lastname;
	}

	public WebElement emailAddressPath() {
		return email;
	}

	public WebElement passwordPath() {
		return password;
	}

	public WebElement confirmPasswordPath() {
		return confirmation;
	}

	public WebElement registrationButtonPath() {
		return register;
	}

}
