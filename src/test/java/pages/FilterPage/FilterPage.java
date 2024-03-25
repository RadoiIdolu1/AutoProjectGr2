package pages.FilterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class FilterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(FilterPage.class);
    public static FilterPage instance;

    private FilterPage(){

    }

    public static FilterPage getInstance(){
        if (instance == null){
            instance = new FilterPage();
        }
        return instance;
    }

    private By cookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    public By selWomen = By.xpath("//a[@id='link-custom-page-SNEAKERS WOMEN-3']");
    public By selFilter = By.xpath("//a[@class='select-title']");
    public By setLtoH = By.xpath("//a[normalize-space()='Price, low to high']");
    public By setHtoL = By.xpath("//a[normalize-space()='Price, high to low']");
    public By setAtoZ = By.xpath("//a[normalize-space()='Name, A to Z']");


    public void acceptCookies(){
        LOG.info("Accept cookies");
        driver.findElement(cookies).click();
    }

    public void clickWomen(){
        LOG.info("select the women sneaker category");
        driver.findElement(selWomen).click();
    }

    public void clickFilter(){
        LOG.info("select filter");
        driver.findElement(selFilter).click();
    }

    public void setLowToHigh(){
        LOG.info("Filter low to high");
        driver.findElement(setLtoH).click();
    }

    public void setHighToLow(){
        LOG.info("Set the price High to Low");
        driver.findElement(setHtoL).click();
    }

    public void setFromAtoZ(){
        LOG.info("Set the item from A to Z");
        driver.findElement(setAtoZ).click();
    }



}
