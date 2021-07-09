package anyWebsite;

import Website_Pages.Contact_Page;

import org.testng.annotations.Test;

public class TC_03_Contact_Page_Test extends Contact_Page {

    Contact_Page contactPage = new Contact_Page();

    @Test
    public void ContactForm(){
        String addContactForm = contactPage.ContactDetails();
        }
    }


