package objectRepository.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MytheresaAccountInformationPage {
	
	WebDriver driver;
	
	@FindBy(id="current_password")
	WebElement current_pass;
	
	@FindBy(id="password")
	WebElement new_pass;
	
	@FindBy(id="confirmation")
	WebElement confirmation;
	
	@FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/div/button")
	WebElement save;
	
	// constructor method
	public MytheresaAccountInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement currentPassTextPath() {
		return current_pass;
	}
	
	public WebElement newPassTextPath() {
		return new_pass;
	}
	
	public WebElement confirmPassTextPath() {
		return confirmation;
	}
	
	public WebElement saveButtonPath() {
		return save;
	}

}
