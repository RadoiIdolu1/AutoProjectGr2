package pages.Newsletter;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Newsletter extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(Newsletter.class);
    public static Newsletter instance;

    private Newsletter(){

    }

    public static Newsletter getInstance(){
        if(instance == null){
            instance = new Newsletter();
        }
        return  instance;
    }

    private By cookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private By emailField= By.xpath("//input[@type='email']");
    private By button = By.xpath("//input[@type='submit']");
    private By checkbox = By.xpath("//input[@name='mc4wp-subscribe']");


    public void acceptCookies(){
        LOG.info("Accept cookies");
        driver.findElement(cookies).click();
    }

    public void insEmail(String email){
        LOG.info("Insert email");
        driver.findElement(emailField).sendKeys(email);
    }

    public void pressButton(){
        LOG.info("Press the button");
        driver.findElement(button).click();
    }

    public void pressCheck(){
        LOG.info("Press the check button");
        driver.findElement(checkbox).click();
    }

}
