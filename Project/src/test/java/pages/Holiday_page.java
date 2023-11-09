package pages;

import java.io.IOException;
import java.text.SimpleDateFormat;

import utils.ExcelReader;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.util.Date;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import uistore.HolidayUI;
import utils.Reporter;
import utils.WebDriverHelper;
public class Holiday_page  {

   private WebDriverHelper w; // Declare a WebDriverHelper instance
	LoggerHandler logger = new LoggerHandler();
    Reporter reporter = new Reporter();
    
    public Holiday_page(WebDriver driver) {
        w = new WebDriverHelper(driver);
        
    }

    
	    public void  holiday_page(WebDriver driver) throws IOException {
	    	ExtentTest test = Reporter.generateExtentReport().createTest("Poll_Page","Execution of COMMUNITY POLL page");
	    	try {
	    		test.log(Status.PASS,"Browser Launched");
	    		LoggerHandler.logInfo("Browser Relaunched");
	    		w.clickOnElement(HolidayUI.holiday);
	    		test.log(Status.PASS, "Holiday link clicked");
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in clicking Holiday link");
	             test.fail("Failed to Perform  Click", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	      
	    		}
	    	
	    	try {
	    		w.sendKeys(HolidayUI.depart_time,"Mumbai");
	    		test.log(Status.PASS, "Entered Depature Location");
	    		w.enterAction(HolidayUI.depart_time);
	    		test.log(Status.PASS, "Enter Key pressed on Depature Location");
	    	}
	     catch(Exception e)
	    	{
	    	 e.printStackTrace();
	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in depature location");
             test.fail("Failed to enter the Departure location", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
      
	    	 
	    	}
	    	try {
	    		w.sendKeys(HolidayUI.going_to,"New Delhi");
	    		test.log(Status.PASS, "Entered Going to Location");
	    		w.enterAction(HolidayUI.going_to);
	    		test.log(Status.PASS, "Enter Key pressed on Going to Location");
	    	}
	     catch(Exception e)
	    	{
	    	 e.printStackTrace();
	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Going to location");
             test.fail("Failed to enter the Going to location", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
      
	    	 
	    	}
	    	try {
	    		w.clickOnElement(HolidayUI.month);
	    		test.log(Status.PASS, "Clicked Month");
	    		w.clickOnElement(HolidayUI.mon_option);
	    		test.log(Status.PASS, "Value of the month selected");
	    	}
	     catch(Exception e)
	    	{
	    	 e.printStackTrace();
	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Month");
             test.fail("Failed to enter the Month", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
      
	    	 
	
                    }        }
}