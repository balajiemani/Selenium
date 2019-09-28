package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailcomposePF {
	private WebDriver driver;

	public GmailcomposePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@jslog='20510; u014N:cOuCgd,Kr2w4b']")
	public WebElement compose;
	@FindBy(xpath = "//*[@name='to']")
	public WebElement to;
	@FindBy(xpath = "//*[@name='subjectbox']")
	public WebElement subject;
	@FindBy(xpath = "//*[@class='Am Al editable LW-avf tS-tW']")
	public WebElement bodytext;
	@FindBy(xpath = "//*[@class='a1 aaA aMZ']")
	public WebElement attach;
	@FindBy(xpath = "//*[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	public WebElement send;
}
