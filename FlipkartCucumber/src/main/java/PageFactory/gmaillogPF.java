package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmaillogPF {

	private WebDriver driver;

	public gmaillogPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "identifier")
	public WebElement email;
	@FindBy(xpath = "//span[text()='Next']")
	public WebElement submit;
	@FindBy(name = "password")
	public WebElement password;

}
