package runner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Logger;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.LoggerHandler;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.Flight_page;
import utils.Base;
import utils.Reporter;
public class Testcase_Flight extends Base {

    //LoggerHandler logger = new LoggerHandler();
    ExtentReports reporter = Reporter.generateExtentReport();
    Flight_page f;


    @Test(priority = 3)
    public void TC_003() throws IOException, InterruptedException {
        
            ExtentTest test = reporter.createTest("WithdrawTest ", "Execution for WithdrawTest");
            navigateToURL(driver, prop);
            f = new Flight_page(driver);
            f.Search_flight(driver);
           
    }
    
    

@BeforeMethod
public void beforeMethod() throws MalformedURLException {
    openBrowser();

}

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        reporter.flush();
       // logger.logInfo("Browser closed");
        
    }
}

