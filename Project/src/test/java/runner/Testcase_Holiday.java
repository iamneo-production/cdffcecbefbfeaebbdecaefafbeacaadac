package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import pages.Holiday_page;
import pages.Hotel_page;
import utils.Base;
import utils.Reporter;
public class Testcase_Holiday extends Base {

    LoggerHandler logger = new  LoggerHandler();
    ExtentReports reporter = Reporter.generateExtentReport();;

    Holiday_page holidays;

    
     @Test(priority = 2)
    public void TC_002() throws IOException {
            navigateToURL(driver, prop);
            holidays = new Holiday_page(driver);
            holidays.holiday_page(driver);
           
        
        
    }   

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();

}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        reporter.flush();
        logger.logInfo("Browser closed");
        //LoggerHandler.closeHandler();
    }
}

