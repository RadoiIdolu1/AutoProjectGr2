package tests.ItemsTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.SelectItems.ItemsPage;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class ItemsTest extends BaseTest {
    public static final Logger LOG =LoggerFactory.getLogger(ItemsTest.class);

    @Test
    public void addItems(){

        LOG.info("Select Male Sneakers");
        itemsPage.setSneakerMale();

        LOG.info("Select the sneaker");
        itemsPage.setSneaker();

        LOG.info("Choose the size of the sneaker");
        itemsPage.setSizeSneaker();

        LOG.info("Select my size(47)");
        itemsPage.set47();

        LOG.info("Add in cart");
        itemsPage.add();

    //assert daca exista produsul in cos


    }

}
