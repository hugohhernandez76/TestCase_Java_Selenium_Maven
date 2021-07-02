package anyWebsite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logout_Test extends Browser{


        @Test(priority = 7)
        void LogoutUser(){
            driver.findElement(By.xpath("//a[@id='logout2']")).click();

        }
    }




