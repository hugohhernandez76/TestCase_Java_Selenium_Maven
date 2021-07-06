package Website_Pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart_Page extends Browser {


    public  String addLaptopToCart() {    //Adding a Laptop to the Cart
        driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click(); // Click on Laptops button from main page
        driver.findElement(By.xpath("//a[contains(text(),'MacBook Pro')]")).click(); //Selects laptop from menu
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click(); //Adds to the cart
        driver.findElement(By.xpath("//a[contains(text(),'Cart')]")).click(); // go to Cart
        driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click(); // Place an order
        //driver.findElement(By.partialLinkText("Home"));
        return null;
    }



        //Fill out shipping form and payment method
    public  String FillOutForm(){

            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Victor Hernandez");
            driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Mexico");
            driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Queretaro");
            driver.findElement(By.xpath("//input[@id='card']")).sendKeys("4125789645237452");
            driver.findElement(By.xpath("//input[@id='month']")).sendKeys("02");
            driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2025");
            return null;
        }


    public static String confirmPlacingOrder(){    //Placing the order
        driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();

        return null;
    }

    public String ClickOKToCompleteOrder(){
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();

        return null;
    }

}