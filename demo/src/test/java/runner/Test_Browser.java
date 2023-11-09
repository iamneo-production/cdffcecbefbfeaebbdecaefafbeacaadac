package test.java.runner;

import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Test_Browser {

    WebDriver driver;

    @Test
    public void display1() throws MalformedURLException , InterruptedException{

         

        String remoteUrl = "http://localhost:4444/"; // Replace with the actual remote machine URL      

        DesiredCapabilities capabilities = new DesiredCapabilities();        

        capabilities.setBrowserName("chrome"); // Specify the browser you want to use        

        RemoteWebDriver driver = new RemoteWebDriver(new URL(remoteUrl), capabilities);   
        driver.get("https://www.google.com");
      }

   

   

 

}

  

 

