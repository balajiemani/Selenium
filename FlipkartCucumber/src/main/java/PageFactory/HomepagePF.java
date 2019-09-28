package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePF {
	private WebDriver driver;

	public HomepagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@class='Wbt_B2 _1YVU3_'])[1]")
	public WebElement electronics;

	@FindBy(xpath = "(//*[@class='Wbt_B2 _1YVU3_'])[2]")
	public WebElement tvandapps;

	@FindBy(xpath = "(//*[@class='Wbt_B2 _1YVU3_'])[3]")
	public WebElement men;

	@FindBy(xpath = "(//*[@class='Wbt_B2 _1YVU3_'])[4]")
	public WebElement women;

	// //*[@class='_2AkmmA _29YdH8_2AkmmA _29YdH8'] X button

	@FindBy(xpath = "//*[@class='_2AkmmA _29YdH8_2AkmmA _29YdH8']")
	public WebElement X;
	@FindBy(xpath = "//*[@class='_1KCOnI _3ZgIXy']")
	public WebElement gaminglap;
}
