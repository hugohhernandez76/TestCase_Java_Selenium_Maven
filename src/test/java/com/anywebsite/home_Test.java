package com.anywebsite;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

class home_Test {
    public static WebDriver driver = new ChromeDriver();
//Main method setting properties where the webdriver is located
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\Drivers\\chromedriver.exe");
        //Creating object for ChromeDriver

        //Calling the website to access
        driver.get("https://www.demoblaze.com/index.html");
        //Maximize window
        driver.manage().window().maximize();
        //Placed an implicit wait of 10 seconds to manage alerts
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    void getTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("STORE", driver.getTitle());
    }

}


