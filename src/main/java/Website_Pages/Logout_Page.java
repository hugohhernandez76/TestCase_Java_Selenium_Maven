package Website_Pages;

import Website_Pages.Browser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logout_Page extends Browser {



        void LogoutUser(){
            driver.findElement(By.xpath("//a[@id='logout2']")).click();

        }
    }




