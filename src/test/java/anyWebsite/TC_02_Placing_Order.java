package anyWebsite;

import Website_Pages.Browser;
import Website_Pages.Cart_Page;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_02_Placing_Order extends Browser {



    @Override
    public void signUp() {
        super.signUp();
    }


    @Test
     public void validateSamsungS6Added() {
        String addingSamsung6 = Cart_Page.addPhoneToCart();
        Assert.assertEquals(addingSamsung6, "Samsung galaxy s6");


    }
}