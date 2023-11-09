package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import pages.Hotel_page;
import utils.Base;
import utils.Reporter;
public class Testcase_Hotel extends Base {

    LoggerHandler logger = new LoggerHandler();
    ExtentReports extent = new ExtentReports();
    Hotel_page Homepage;
   
    
    @Test(priority = 1)
    public void TC_001() throws IOException, InterruptedException {  
            navigateToURL(driver, prop);
            Homepage = new Hotel_page(driver);
            Homepage.hotel_page(driver);     
    }    

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();
    extent = Reporter.generateExtentReport();


}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        extent.flush();
        logger.logInfo("Browser closed");
        
    }
}

