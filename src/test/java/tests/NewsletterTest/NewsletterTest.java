package tests.NewsletterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.Newsletter.Newsletter;
import tests.BaseTest;

public class NewsletterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(Newsletter.class);

    String email = "RadoiIdolu1@Test123.com";



    @Test
    public void fillNewsletter(){

        fillNewsletter.insEmail(email);


        fillNewsletter.pressButton();

    }
}
