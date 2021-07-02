package anyWebsite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;




public class about_us_Test extends Browser{

    @Test(priority = 6)
    void About_Us_Test(){
        driver.findElement(By.xpath("//a[contains(text(),'About us')]")).click();

    }


 }



