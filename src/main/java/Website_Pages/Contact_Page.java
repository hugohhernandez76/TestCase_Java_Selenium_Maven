package Website_Pages;

import Website_Pages.Browser;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Contact_Page extends Browser {

    public String ContactDetails(){
        //Details sent to the contact form
        driver.findElement(By.xpath("//*[@id='navbarExample']/ul/li[2]/a")).click(); // Click on contact link
        driver.findElement(By.xpath("//input[@id='recipient-email']")).sendKeys("yourmail@mymail.com");
        driver.findElement(By.xpath("//input[@id='recipient-name']")).sendKeys("My Name");
        driver.findElement(By.xpath("//textarea[@id='message-text']")).sendKeys("This is to fill out your details.");
        driver.findElement(By.xpath("//textarea[@id='message-text']")).click();

        return null;

    }

    @Override
    public String returnToHomePage() {
        return super.returnToHomePage();
    }
}


