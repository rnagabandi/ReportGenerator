package com.automation.report.ReportGenerator;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.automation.report.controller.Logging;
import com.automation.report.controller.TestRetryAnalyzer;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	public static boolean retryTest=false;
	public static int i=0;
	public static WebDriver driver=null;
	
	@Test(groups={"test"})
	public void test(){
		
		System.setProperty("webdriver.chrome.driver", "F:/raghav/ws/ReportGenerator/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.softwaretestingmaterial.com/software-testing-interview-questions-free-ebook/");
		Logging.log(AppTest.class.getName());
		Assert.assertTrue(false);
		Logging.log("App Test");
		Logging.log("First test Case");
		
	}
	
	/*//@AfterMethod //AfterMethod annotation - This method executes after every test execution
	 public void screenShot(ITestResult result){
	 //using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
	 if(ITestResult.FAILURE==result.getStatus()){
	 try{
	 // To create reference of TakesScreenshot
	 TakesScreenshot screenshot=(TakesScreenshot)driver;
	 // Call method to capture screenshot
	 File src=screenshot.getScreenshotAs(OutputType.FILE);
	 // Copy files to specific location 
	 // result.getName() will return name of test case so that screenshot name will be same as test case name
	 FileUtils.copyFile(src, new File("F:\\"+result.getName()+".png"));
	 System.out.println("Successfully captured a screenshot");
	 }catch (Exception e){
	 System.out.println("Exception while taking screenshot "+e.getMessage());
	 } 
	 }
	 driver.quit();
	 }*/
	
	
}
