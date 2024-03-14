package pages.Register;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class RegisterPage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage(){

    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    private By selMale = By.xpath("//input[@name='id_gender' and @value='1']");
    private By firstName = By.xpath("//input[@name='firstname']");
    private By lastName = By.xpath("//input[@name='lastname']");
    private By email = By.xpath("//input[@name='email']");
    private By pass = By.xpath("//input[@name='password']");

    public void selMale(){
        LOG.info("select gender");
        driver.findElement(selMale).click();
    }

    public void insFirst(String fName){
        LOG.info("insert first name");
        driver.findElement(firstName).sendKeys(fName);
    }

    public void insLast(String lName) {
        LOG.info("insert last name");
        driver.findElement(lastName).sendKeys(lName);
    }

    public void insEmail(String mail){
        LOG.info("insert email");
        driver.findElement(email).sendKeys(mail);
    }

    public void insPass(String password) {
        LOG.info("insert password");
        driver.findElement(pass).sendKeys(password);
    }




}
