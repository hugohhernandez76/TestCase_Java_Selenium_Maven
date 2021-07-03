package Website_Pages;


import Website_Pages.Browser;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Home_Test extends Browser {

        //Run test to validate Title of the site is the same as the one expected.
    void WebsiteTitle() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "STORE";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }


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


    void signUp(){
        driver.findElement(By.cssSelector("#signin2")).click();
        driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys(userID);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(passWord);
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();



    }

    void ValidateUserLoggedin (){
        String expectedUser = "OneTest";
        String nameOfUser = driver.findElement(By.xpath("//a[normalize-space(text() ) = 'Welcome OneTest']")).getText();
        Assert.assertEquals(expectedUser, nameOfUser);



    }



}


