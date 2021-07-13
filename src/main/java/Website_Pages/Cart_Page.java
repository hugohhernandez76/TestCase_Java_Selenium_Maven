package Website_Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Cart_Page extends Browser {
//    WebDriverWait woo=new WebDriverWait(driver,5);
//        driver.findElement
//    //a[contains(text(),'Click to load get data via Ajax!')]

    public  void addLaptopToCart() {    //Adding a Laptop to the Cart
        System.out.println("Metodo");
        List<WebElement> all = driver.findElements(By.xpath("//*[contains(text(), 'Laptop')]"));
        System.out.println("size list is : " + all.size());
        WebElement laptopOption = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Laptop')]")));
        try {

            laptopOption.click();
        }catch (StaleElementReferenceException se){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",laptopOption );
        }
    }

           //Fill out shipping form and payment method
    public  String FillOutForm(){
        WebDriverWait waitForm  = new WebDriverWait(driver, 5);
        waitForm.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        System.out.println("Waited for the form to load");



        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Victor Hernandez");
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Mexico");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Queretaro");
        driver.findElement(By.xpath("//input[@id='card']")).sendKeys("4125789645237452");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("02");
        driver.findElement(By.xpath("//input[@id='month']")).sendKeys("2025");
            return null;
            }


    public static String confirmPlacingOrder(){    //Placing the order
        driver.findElement(By.xpath("//button[normalize-space()='Purchase']")).click();

        return null;
    }

    public String ClickOKToCompleteOrder(){
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();

        return null;
    }

    @Override
    public String returnToHomePage() {
        return super.returnToHomePage();
    }
}