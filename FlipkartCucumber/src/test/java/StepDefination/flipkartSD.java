package StepDefination;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import FrameWork.Flipkart.SampleBrowser;

import FrameWork.Flipkart.roboter;
import PageFactory.GmailcomposePF;
import PageFactory.HomepagePF;
import PageFactory.ItemPF;
import PageFactory.LoginPF;
import PageFactory.gmaillogPF;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

/**
 * @author Balaji
 *
 */
public class flipkartSD extends SampleBrowser {

	/**
	 * @throws IOException
	 *             method opens flipkart and logins
	 */

	@Given("^browser opened with flipkart$")
	public void browser_opened_with_flipkart() throws IOException {
		Login();
		LoginPF lp = new LoginPF(driver);
		lp.email.sendKeys("8886789404");
		lp.password.sendKeys("evlakshmi@123");
		lp.submit.click();
	}

	/**
	 * @throws InterruptedException
	 * @throws IOException
	 *             opens flipkart and takes screenshots
	 */

	@And("^when taken screenshots with required actions$")
	public void when_taken_screenshots_with_required_actions() throws InterruptedException, IOException {
		HomepagePF h = new HomepagePF(driver);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(h.electronics).build().perform();
		screenshot();
		Thread.sleep(2000);
		act.moveToElement(h.men).build().perform();
		screenshot();
		Thread.sleep(2000);
		act.moveToElement(h.tvandapps).build().perform();
		screenshot();
		Thread.sleep(2000);
		act.moveToElement(h.women).build().perform();
		screenshot();

	}

	/**
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 *             open new tab gmail
	 */

	@When("^open new window and open gmail$")
	public void open_new_window_and_open_gmail() throws IOException, InterruptedException, AWTException {
		String path = "C:\\Users\\spsoft\\Desktop\\Xls";
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		robot.delay(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}

	/**
	 * @throws InterruptedException
	 *             login to gmail.com
	 */

	@Then("^compose email and send screenshots$")
	public void compose_email_and_send_screenshots() throws InterruptedException {
		gmaillogPF glog = new gmaillogPF(driver);
		new GmailcomposePF(driver);
		glog.email.sendKeys("8886789404");
		glog.submit.click();
		glog.password.sendKeys("evlakshmi@123");
		Thread.sleep(3000);
		glog.submit.click();

	}

	/**
	 * @throws InterruptedException
	 * @throws AWTException
	 *             compose mail and attach screenshots
	 */
	@Then("^close browser$")
	public void close_browser() throws InterruptedException, AWTException {
		GmailcomposePF gcomp = new GmailcomposePF(driver);
		WebDriverWait exw = new WebDriverWait(driver, 20);
		exw.until(ExpectedConditions.visibilityOf(gcomp.compose));
		gcomp.compose.click();
		gcomp.to.sendKeys("balajiemani30@gmail.com");
		gcomp.subject.sendKeys("screenshots taken ");
		gcomp.bodytext.sendKeys("see attachments");
		gcomp.attach.click();
		roboter.robot();
		Thread.sleep(10000);
		gcomp.send.click();
		driver.close();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());

	}

	@Given("^browser opened with flipkart1$")
	public void browser_opened_with_flipkart1() throws IOException {
		Login();
		LoginPF lp = new LoginPF(driver);
		lp.email.sendKeys("8886789404");
		lp.password.sendKeys("evlakshmi@123");
		lp.submit.click();
	}

	@And("^choose gaming laptop and add to cart$")
	public void choose_gaming_laptop_and_add_to_cart() throws AWTException, InterruptedException, IOException {

		HomepagePF h = new HomepagePF(driver);
		ItemPF ip = new ItemPF(driver);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(h.electronics).build().perform();
		act.clickAndHold().build().perform();
		act.moveToElement(h.gaminglap).click();
		screenshot();
		/*
		 * ip.viewall.click(); ip.h2l.click(); screenshot(); ip.firstitem.click();
		 * screenshot(); ArrayList<String> tabs = new
		 * ArrayList<String>(driver.getWindowHandles());
		 * driver.switchTo().window(tabs.get(1)); ip.cart.click(); screenshot();
		 * driver.switchTo().window(tabs.get(2)); ip.remove.click();
		 */
		ip.logo.click();
		screenshot();

	}

	@When("^delete from cart and open gmail$")
	public void delete_from_cart_and_open_gmail() throws InterruptedException, IOException, AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		robot.delay(1000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get(
				"https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		gmaillogPF glog = new gmaillogPF(driver);
		new GmailcomposePF(driver);
		glog.email.sendKeys("8886789404");
		glog.submit.click();
		glog.password.sendKeys("evlakshmi@123");
		Thread.sleep(3000);
		glog.submit.click();

	}

	@Then("^compose mail and send ScreenShots$")
	public  void compose_mail_and_send_screenshots() throws AWTException, InterruptedException {

		GmailcomposePF gcomp = new GmailcomposePF(driver);
		WebDriverWait exw = new WebDriverWait(driver, 20);
		exw.until(ExpectedConditions.visibilityOf(gcomp.compose));
		gcomp.compose.click();
		gcomp.to.sendKeys("balajiemani30@gmail.com");
		gcomp.subject.sendKeys("screenshots taken ");
		gcomp.bodytext.sendKeys("see attachments");
		gcomp.attach.click();
		roboter.robot();
		Thread.sleep(10000);
		gcomp.send.click();
		driver.close();

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());

	}

	@Given("^flipkart opened$")
	public void flipkart_opened() throws IOException {
		Login();
		LoginPF lp = new LoginPF(driver);
		lp.email.sendKeys("8886789404");
		lp.password.sendKeys("evlakshmi@123");
		lp.submit.click();
	}

	@When("^validate title$")
	public void validate_title() throws IOException {
		Assert.assertEquals("Online Shopping Site for Mobiles, Electronics,est Offers!", driver.getTitle());
		screenshot();

	}

	@Then("^close driver$")
	public void close_driver() {
		System.out.println("sample");
	}

}