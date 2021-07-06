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
    By categories = By.xpath("//a[@id='cat']");
    By phoneslink = By.xpath("//a[contains(text(),'Phones')]");
    By laptopslink = By.xpath("//a[contains(text(),'Laptops')]");
    By monitorslink = By.xpath("//a[contains(text(),'Monitors')]");
    By usrloggedin = By.xpath("//a[@id='nameofuser']");

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

    public  void signUp(){
        driver.findElement(By.cssSelector("#signin2")).click();
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(userID);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();

    }
    @AfterSuite
    public static void tearDown(){
        driver.close();
    }

}
