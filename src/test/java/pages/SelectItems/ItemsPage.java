package pages.SelectItems;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ItemsPage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(ItemsPage.class);
    public static ItemsPage instance;

    private ItemsPage() {

    }

    public static ItemsPage getInstance() {
        if (instance == null) {
            instance = new ItemsPage();
        }
        return instance;
    }

    private By cookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private By sneakersMen =By.xpath("//a[contains(text(), 'SNEAKERS M')]");
    private By sneaker = By.xpath("//img[@src='https://sneakerindustry.ro/113968-category_products/6-retro.jpg']");
    private By sizeDropdown = By.id("group_28");
    private By selectSize = By.xpath("//option[@value='174']");
    private By addInCart = By.xpath("//button[@name='add']");


    public void acceptCookies(){
        LOG.info("Accept cookies");
        driver.findElement(cookies).click();
    }

    public void setSneakerMale(){
        LOG.info("Select Male Sneakers");
        driver.findElement(sneakersMen).click();
    }

    public void setSneaker(){
        LOG.info("Select the sneaker");
        driver.findElement(sneaker).click();
    }

    public void setSizeSneaker(){
        LOG.info("Select the size");
        driver.findElement(sizeDropdown).click();
    }

    public void set45(){
        LOG.info("Select the size 45");
        driver.findElement(selectSize).click();
    }

    public void add(){
        LOG.info("Add in cart");
        driver.findElement(addInCart).click();
    }




}

