package Website_Pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cart_Page extends Browser {

    public  String addLaptopToCart() {    //Adding a Laptop to the Cart
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Laptops')]"))).click();
        //driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click(); // Click on Laptops button from main page
        driver.findElement(By.xpath("//a[normalize-space()='MacBook Pro']")).click(); //Selects laptop from menu
        driver.findElement(By.xpath("//a[normalize-space()='Add to cart']")).click(); //Adds to the cart
        driver.findElement(By.xpath("//a[normalize-space()='Cart']")).click(); // go to Cart

//        Wait<WebDriver> wait = new FluentWait<>(driver)  //FluentWait waiting for the form to load
//                .withTimeout(Duration.ofSeconds(3))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='modal-dialog'][3]")));
        //driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click(); // Place an order



        return null;
    }

           //Fill out shipping form and payment method
    public  String FillOutForm(){
        WebDriverWait waitForm  = new WebDriverWait(driver, 5);
        waitForm.until(ExpectedConditions.visibilityOf((WebElement) By.xpath("//div[@class='modal-dialog'][3]")));
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