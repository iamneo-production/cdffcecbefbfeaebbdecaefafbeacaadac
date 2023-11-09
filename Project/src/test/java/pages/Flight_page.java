package pages;

import java.io.IOException;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.WebDriver;
import uistore.FlightUI;
import utils.Reporter;
import utils.WebDriverHelper;
import org.apache.log4j.Logger;
public class Flight_page {
WebDriverHelper w; // Declare a WebDriverHelper instance  
     Reporter reporter = new Reporter();
    //  ReadPropertyFile configReader = new ReadPropertyFile();
     LoggerHandler logger = new LoggerHandler();

     
     public Flight_page(WebDriver driver) {
        System.out.println("Heelo");
        w = new WebDriverHelper(driver);
     }
      public void Search_flight(WebDriver driver) throws IOException, InterruptedException {
       
       
        ExtentTest test = Reporter.generateExtentReport().createTest("Search Flight Test", "Execution for Search Function");
        try{
          //  Thread.sleep(5000);
            w.clickOnElement(FlightUI.from);
            
          LoggerHandler.logInfo("Clicked FROM option");
            w.sendKeys(FlightUI.from, "Bangalore ");
            LoggerHandler.logInfo("Entered value for FROM option");
           // logger.logInfo("12345678");
            w.enterAction(FlightUI.from);
    		 LoggerHandler.logInfo("Enter clicked");
            // Thread.sleep(5000);
        }
         catch (Exception ex) {
                       ex.printStackTrace();
                       String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Depature location error");
                       test.fail("Failed to enter the depature location", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
                    }
        try{
            w.clickOnElement(FlightUI.to);
            LoggerHandler.logInfo("Clicked TO option");
            w.sendKeys(FlightUI.from, "Chennai International");
            LoggerHandler.logInfo("Entered value for TO option");
            w.enterAction(FlightUI.to);
    		 LoggerHandler.logInfo("Enter clicked");
        }
         catch (Exception ex) {
                       ex.printStackTrace();
                       String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Arrival location error");
                       test.fail("Failed to enter the Arrival location", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }
        try{
            w.clickOnElement(FlightUI.dep_date);
            LoggerHandler.logInfo("Clicked depature_date option");
            w.clickOnElement(FlightUI.d_date);
            LoggerHandler.logInfo("Entered value for depature date");
        }
         catch (Exception ex) {
                       ex.printStackTrace();
                       String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Dapature Date error");
                       test.fail("Failed to enter the Dapature Date", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }
        try{
            w.clickOnElement(FlightUI.return_date);
            LoggerHandler.logInfo("Clicked return_date option");
            w.clickOnElement(FlightUI.r_date);
            LoggerHandler.logInfo("Entered value for return date");
        }
         catch (Exception ex) {
                       ex.printStackTrace();
                       String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Return Date error");
                       test.fail("Failed to enter the Return Date", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
        }  
         try{
            w.clickOnElement(FlightUI.citizen);
            LoggerHandler.logInfo("Clicked return_date option");
        
        }
         catch (Exception ex) {
                       ex.printStackTrace();
                       String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Senior Citizen error");
                       test.fail("Failed to Click Senior Citizen", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            } 
          try{
            w.clickOnElement(FlightUI.search_btn);
            LoggerHandler.logInfo("Clicked Search flight option");
        
        }
         catch (Exception ex) {
                       ex.printStackTrace();
                       String base64Screenshot = Reporter.captureScreenshotAsBase64(driver, "Search flight error");
                       test.fail("Failed to Click Search flight", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
            }   
            
      }
 }
