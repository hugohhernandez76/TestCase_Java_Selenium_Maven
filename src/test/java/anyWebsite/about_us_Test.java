package anyWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class about_us_Test extends Browser{


    void About_Us_Test(){
        driver.findElement(By.xpath("//a[contains(text(),'About us')]")).click();

    }


 }



