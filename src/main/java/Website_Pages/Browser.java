package Website_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public abstract class Browser {

    public static WebDriver driver;
    String userID = "Onetest";
    String passWord = "123456";
    By categories = By.xpath("//a[normalize-space()='CATEGORIES']");
    By phoneslink = By.xpath("//a[normalize-space()='Phones']");
    By laptopslink = By.xpath("//a[normalize-space()='Laptops']");
    By monitorslink = By.xpath("//a[normalize-space()='Monitors']");
    By usrloggedin = By.xpath("//a[normalize-space()='Welcome OneTest']");

    @BeforeSuite

    public static WebDriver driverSetUP(){
        System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        //Calling the website to access
        driver.get("https://www.demoblaze.com/");
        //Maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;

    }



    public String returnToHomePage(){
        driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[1]/a")).click();
        return null;
    }
    @AfterSuite
    public static void tearDown(){
        driver.close();
    }

}
