package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }

    private By cookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private By signInButton = By.className("login");
    private By emailSignIn = By.xpath("//input[@name='email']");
    private By passSignIn = By.xpath("//input[@name='password']");
    private By signIn = By.xpath("//button[@data-link-action='sign-in']");

    public void acceptCookies(){
        LOG.info("Accept cookies");
        driver.findElement(cookies).click();
    }

    public void pressSignIn(){
        LOG.info("press sign in button");
        driver.findElement(signInButton).click();
    }

    public void insertEmail(String mail){
        LOG.info("insert email address");
        driver.findElement(emailSignIn).sendKeys(mail);
    }

    public void insertPassword(String password){
        LOG.info("insert password");
        driver.findElement(passSignIn).sendKeys(password);
    }

    public void signIn(){
        LOG.info("sign in");
        driver.findElement(signIn).click();
    }



}