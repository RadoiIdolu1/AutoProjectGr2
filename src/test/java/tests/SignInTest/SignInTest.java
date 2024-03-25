package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.testng.annotations.Test;

import tests.BaseTest;

import static pages.BasePage.sleep;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    String mail = "mrtwin999@yahoo.com";
    String password = "Alex.2002";

    @Test
    public void signIn() {

        LOG.info("Accept cookies");
        signInPage.acceptCookies();
        sleep(1000L);

        LOG.info("press the sign in button");
        signInPage.pressSignIn();

        LOG.info("insert email address");
        signInPage.insertEmail(mail);

        LOG.info("insert password");
        signInPage.insertPassword(password);

        LOG.info("sign in");
        signInPage.signIn();

        sleep(1000);
    }
}