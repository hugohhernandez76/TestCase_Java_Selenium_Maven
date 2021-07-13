package Website_Pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;

public class Home_Page extends Browser {



    //Get page title
    public String getPageTitle(){
        return driver.getTitle();

    }

    public String signUp(){
        driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys(userID);
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys(passWord);
        driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

        return null;
    }

        //Validate Categories exist and all the options
    public String getCategories() {

        return driver.findElement(categories).getText();
    }
    public String getPhonesLink(){

        return driver.findElement(phoneslink).getText();
    }
    public String getLaptopsLink(){

        return driver.findElement(laptopslink).getText();
    }
    public String getMonitorsLink(){
        return driver.findElement(monitorslink).getText();
    }

    public String  ValidateUserLoggedin(){
        return driver.findElement(usrloggedin).getText();
    }



}


