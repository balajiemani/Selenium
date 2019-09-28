package FrameWork.Flipkart;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.internal.thread.IFutureResult;

public class SampleBrowser {
	public static WebDriver driver;

	public static void Login() throws IOException

	{

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"D:\\Selenium task\\Flipkart\\src\\main\\java\\FrameWork\\Flipkart\\datadriver.properties");

		prop.load(fis);

		// System.out.println(prop.getProperty("username"));

		if (prop.getProperty("browser").contains("firefox"))

		{
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\spsoft\\Desktop");
			driver = new FirefoxDriver();

		}

		else if (prop.getProperty("browser").contains("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\spsoft\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// driver.findElement(By.xpath:').sendkeys(username)
		
	}
	public static void screenshot()  throws IOException {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			
			
			String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

			FileUtils.copyFile(scrFile, new File("C:\\Users\\spsoft\\Desktop\\SeleniumScreenshots\\"+driver.getTitle()+".png"+timestamp));
	}
}
