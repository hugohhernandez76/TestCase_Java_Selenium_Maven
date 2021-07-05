package anyWebsite;

import Website_Pages.Browser;
import Website_Pages.Home_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_Home_Page_Test extends Browser {
    Home_Page home_page = new Home_Page(); //Instance was created of Home_Page

    //Run test to validate Title of the site is the same as the one expected.
    @Test
    public void WebsiteTitle() {
       String pageTitle = home_page.getPageTitle();
       Assert.assertEquals(pageTitle, "STORE", "The page Title did not match!");
    }

    @Test //Validate if the Categories is displayed
    public void MainCategories(){
        String mainCategories = home_page.getCategories();
        Assert.assertEquals(mainCategories, "CATEGORIES", "Menu is not displayed");

        String phoneslink = home_page.getPhonesLink();
        Assert.assertEquals(phoneslink, "Phones", "Link does not exist or match!");

        String laptopslink = home_page.getLaptopsLink();
        Assert.assertEquals(laptopslink, "Laptops", "LInk does not exist or match!");

        String monitorslink = home_page.getMonitorsLink();
        Assert.assertEquals(monitorslink, "Monitors", "Link does not exist or match!");
    }
    @Test
    public void userValidation(){
        String currentUser = home_page.ValidateUserLoggedin();
        Assert.assertFalse(Boolean.parseBoolean(currentUser), "Welcome OneTest");
    }

}


