package anyWebsite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;




public class about_us_Test extends Browser{

    @Test
    void About_Us_Test(){
        driver.findElement(By.xpath("//a[contains(text(),'About us')]")).click();

    }


 }



