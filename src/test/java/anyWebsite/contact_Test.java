package anyWebsite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class contact_Test extends Browser{
    @Test(priority = 5)
    void ContactDetails(){

        driver.findElement(By.linkText("Contact")).click();
        driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("Hugo Hernandez");
        driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("Demo Test");
        driver.findElement(By.xpath("//button[contains(text(),'Send message')]")).click();

        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

    }


}
