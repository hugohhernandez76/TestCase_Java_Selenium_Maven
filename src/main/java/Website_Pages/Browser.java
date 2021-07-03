package Website_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browser {

    public static WebDriver driver;
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

    }
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

}
