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

    private By sneakersMen =By.xpath("//a[contains(text(), 'SNEAKERS M')]");
    private By sneaker = By.xpath("//div[@id='js-product-list']//div[2]//article[1]//a[1]//img[1]");
    private By sizeDropdown = By.id("group_28");
    private By selectSize = By.xpath("//option[@value='202']");
    private By addInCart = By.xpath("//button[@name='add']");




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

    public void set47(){
        LOG.info("Select the size 47");
        driver.findElement(selectSize).click();
    }

    public void add(){
        LOG.info("Add in cart");
        driver.findElement(addInCart).click();
    }




}

