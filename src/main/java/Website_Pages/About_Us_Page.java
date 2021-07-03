package Website_Pages;

import Website_Pages.Browser;
import org.openqa.selenium.By;


public class About_Us_Page extends Browser {


    void About_Us_Test(){
        driver.findElement(By.xpath("//a[contains(text(),'About us')]")).click();

    }


 }



