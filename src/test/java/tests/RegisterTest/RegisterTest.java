package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "autentificare?create_account=1";

    String fName = "Radoi";
    String lName = "Idolu";
    String email = "alex29112002@gmail.com";
    String password = "Idolu1Radoi";



    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(1000);
        LOG.info("select gender");
        registerPage.selMale();

        sleep(1000);
        LOG.info("insert first name");
        registerPage.insFirst(fName);

        sleep(1000);
        LOG.info("insert last name");
        registerPage.insLast(lName);

        sleep(1000);
        LOG.info("insert email");
        registerPage.insEmail(email);

        sleep(1000);
        LOG.info("insert passowrd");
        registerPage.insPass(password);

    }
}
