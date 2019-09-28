package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {
	public WebDriver driver;

	public LoginPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath = "//*[@class='_2zrpKA _1dBPDZ']")
	public WebElement email;

	@FindBy(xpath = "//*[@class='_2zrpKA _3v41xv _1dBPDZ']")
	public WebElement password;

	
	@FindBy(xpath = "//*[@class='_2AkmmA _1LctnI _7UHT_c']")
	public WebElement submit;

	
	
	
	
	
	
}
