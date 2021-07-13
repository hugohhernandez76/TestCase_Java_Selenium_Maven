package anyWebsite;

import Website_Pages.Browser;
import Website_Pages.Cart_Page;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_02_Placing_Order extends Cart_Page {
   Cart_Page cartPage = new Cart_Page();



   @Test
   public Cart_Page getCartPage() {
      return cartPage;
   }

   @Test
   public void LaptopAddToCart() {

      cartPage.addLaptopToCart();
   }

//   @Test
//   public void clickCart(){
//      String GotoCart = cartPage.goToCart();
//   }


   @Test
   public void fillOutOrderForm () {
      String FilloutOrderForm = cartPage.FillOutForm();

   }

}