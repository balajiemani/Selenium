package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPF {
	private WebDriver driver;

	public ItemPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='_2AkmmA _1eFTEo']")
	public WebElement viewall;
	@FindBy(xpath = "(//*[@class='_1xHtJz'])[2]")
	public WebElement h2l;
	@FindBy(xpath = "//*[@class='_3wU53n']")
	public WebElement firstitem;
	@FindBy(xpath = "//*[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	public WebElement cart;
	@FindBy(xpath = "//*[@class='gdUKd9']")
	public WebElement remove;
	@FindBy(xpath = "//*[@alt='Flipkart']")
	public WebElement logo;
}
