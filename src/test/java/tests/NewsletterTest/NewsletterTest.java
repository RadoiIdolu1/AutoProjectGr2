package tests.NewsletterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.Newsletter.Newsletter;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class NewsletterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(Newsletter.class);

    String email = "RadoiIdolu1@Test123.com";



    @Test
    public void fillNewsletter(){

        LOG.info("Accept cookies");
        fillNewsletter.acceptCookies();
        sleep(1000L);

        LOG.info("Insert email");
        fillNewsletter.insEmail(email);
        sleep(1000L);

        LOG.info("Check the box");
        fillNewsletter.pressCheck();
        sleep(1000L);

        LOG.info("Press the subscribe button");
        fillNewsletter.pressButton();
        sleep(1000L);

    }
}
