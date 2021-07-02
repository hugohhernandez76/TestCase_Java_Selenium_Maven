package anyWebsite;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

class home_Test extends Browser{

         //Run test to validate Title of the site is the same as the one expected.
    void WebsiteTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("STORE", driver.getTitle());
    }
         //Validate Categories exist and all the options
    void categoriesOptions(){
        String categories = driver.findElement(By.linkText("CATEGORIES")).getText();
        Assert.assertEquals(categories, "CATEGORIES", "Menu is not displayed");

        String phoneslink = driver.findElement(By.linkText("Phones")).getText();
        Assert.assertEquals(phoneslink, "Phones", "Link does not exist or match!");

        String laptopslink = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).getText();
        Assert.assertEquals(laptopslink, "Laptops", "LInk does not exist or match!");

        String monitorslink = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).getText();
        Assert.assertEquals(monitorslink, "Monitors", "Link does not exist or match!");

    }

    void LogoValidate(){

        driver.findElement(By.xpath("//a[@id='nava']")).click();

    }

    void signUp(){

        driver.findElement(By.cssSelector("#signin2")).click();
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("OneTest");
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();

        //Handle Simple Alert
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();

    }

    void ValidateUserLoggedin (){
        String nameOfUser = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
        Assert.assertEquals("Welcome vhernandez", nameOfUser);



    }

    void LogoutUser(){

        driver.findElement(By.className("#logout2")).click();

    }

    void ExitBrowser(){
        driver.close();
    }

}


