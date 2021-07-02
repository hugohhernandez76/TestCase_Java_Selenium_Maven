package anyWebsite;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class home_Test extends Browser {
    @Test(priority = 1)
        //Run test to validate Title of the site is the same as the one expected.
    void WebsiteTitle() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "STORE";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }

    @Test(priority = 2)
        //Validate Categories exist and all the options
    void categoriesOptions() {
        String categories = driver.findElement(By.linkText("CATEGORIES")).getText();
        Assert.assertEquals(categories, "CATEGORIES", "Menu is not displayed");

        String phoneslink = driver.findElement(By.linkText("Phones")).getText();
        Assert.assertEquals(phoneslink, "Phones", "Link does not exist or match!");

        String laptopslink = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).getText();
        Assert.assertEquals(laptopslink, "Laptops", "LInk does not exist or match!");

        String monitorslink = driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).getText();
        Assert.assertEquals(monitorslink, "Monitors", "Link does not exist or match!");

    }

    @Test(priority = 3)
    void signUp(){
        driver.findElement(By.cssSelector("#signin2")).click();
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(userID);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();



    }
    @Test(priority = 4)
    void ValidateUserLoggedin (){
        String expectedUser = "OneTest";
        String nameOfUser = driver.findElement(By.xpath("//a[normalize-space(text() ) = 'Welcome OneTest']")).getText();
        Assert.assertEquals(expectedUser, nameOfUser);



    }



}


