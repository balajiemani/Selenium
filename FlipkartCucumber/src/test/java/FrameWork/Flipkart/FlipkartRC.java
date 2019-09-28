package FrameWork.Flipkart;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium task\\Flipkart\\src\\test\\java\\feature", glue = "StepDefination", plugin = {
		"pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html " })
public class FlipkartRC extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void setup() {
		Reporter.loadXMLConfig(new File("D:\\Selenium task\\Flipkart\\src\\test\\java\\extent-config.xml"));
		Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
		Reporter.setSystemInfo("User Name", "AJ");
		Reporter.setSystemInfo("Application Name", "IndiGO App ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

	}

}