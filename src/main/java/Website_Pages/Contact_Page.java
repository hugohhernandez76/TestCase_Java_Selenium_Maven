package Website_Pages;

import Website_Pages.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Contact_Page extends Browser {

    void ContactDetails(){

        driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("yourmail@mymail.com");
        driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("My Name");
        driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("This is to fill out your details.");
        driver.findElement(By.xpath("//textarea[@id='message-text']")).click();


    }


}
