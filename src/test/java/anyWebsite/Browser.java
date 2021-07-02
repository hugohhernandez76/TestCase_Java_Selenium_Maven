package anyWebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class Browser {

    public WebDriver driver;
    String userID = "Onetest";
    String passWord = "123456";

    @BeforeSuite
    public void setUp(){
            //Calling driver location
            System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\Drivers\\chromever91\\chromedriver.exe");
            driver = new ChromeDriver();
            //Calling the website to access
            driver.get("https://www.demoblaze.com/");
            //Maximize window
            driver.manage().window().maximize();
            //Placed an implicit wait of 10 seconds to manage alerts
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
