
package pages;

import java.io.IOException;
import java.text.SimpleDateFormat;

import utils.ExcelReader;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.util.Date;
import org.openqa.selenium.WebDriver;
import uistore.HotelsUI;
import utils.Reporter;
import utils.WebDriverHelper;
public class Hotel_page  {

    private WebDriverHelper w; // Declare a WebDriverHelper instance
    private ExcelReader excelReader; 
    ExcelReader file = new ExcelReader();
    
    static{
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
        System.setProperty("current.date.time", dateFormat.format(new Date()));
    }

   LoggerHandler logger = new LoggerHandler();
   Reporter reporter = new Reporter();
   
    
    public Hotel_page(WebDriver driver) {
        w = new WebDriverHelper(driver);
        excelReader = new ExcelReader();
        
    }
    public void hotel_page(WebDriver driver) throws IOException , InterruptedException{
    	ExtentTest test = Reporter.generateExtentReport().createTest("Hotel_page","Execution of Login page");
    	try {
    		Thread.sleep(5000);
    		w.clickOnElement(HotelsUI.hotels);
    		LoggerHandler.logInfo("Hotel Link clicked");
    		test.log(Status.PASS, "Hotel Link clicked");
    		
        } catch (Exception e) {
        	 e.printStackTrace();
	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in clicking Hotel");
             test.fail("Failed to click the hotel link", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
	
        }

    	try {
            String loc =excelReader.ReadData("./testdata/Testdata.xlsx","Sheet1", 1, "hotel_location");
    		 w.sendKeys(HotelsUI.location, loc);
    		 LoggerHandler.logInfo("Location entered");
    		 test.log(Status.PASS,"Location entered");
    		 w.enterAction(HotelsUI.location);
    		 LoggerHandler.logInfo("Enter clicked");
    		 test.log(Status.PASS,"Enter clicked");
    		 
    		
    	}
    	catch(Exception e) {
    		 e.printStackTrace();
	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Location");
             test.fail("Failed to enter the location", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
     

    	}
    	try {
    	 w.clickOnElement(HotelsUI.check_in);
    	 LoggerHandler.logInfo("clicked check_in");
    	 w.clickOnElement(HotelsUI.date_in);
		 LoggerHandler.logInfo("Check_in date entered");
   		 test.log(Status.PASS,"Check_in Date clicked ");
   		
   		 
   		
   	}
   	catch(Exception e) {
   		 e.printStackTrace();
	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Check_in");
            test.fail("Failed to Check_in", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
    

   	}
    	  	
    	try {
       	 w.clickOnElement(HotelsUI.check_out);
       	 LoggerHandler.logInfo("clicked check_out");
       	 w.clickOnElement(HotelsUI.date_out);
			LoggerHandler.logInfo("Check_out date entered");
      	test.log(Status.PASS,"Check_out Date clicked ");
      		
      		 
      		
      	}
      	catch(Exception e) {
      		 e.printStackTrace();
   	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Check_out");
               test.fail("Failed to Check_out", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
       

      	}
    	try {
          	 w.clickOnElement(HotelsUI.search_btn);
          	 LoggerHandler.logInfo("clicked Search button");
          	test.log(Status.PASS,"Search button clicked ");
          			
         	}
         	catch(Exception e) {
         		 e.printStackTrace();
      	    	 String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, " Error in Search button");
                  test.fail("Failed to click search button", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
          

         	}
   }
}
