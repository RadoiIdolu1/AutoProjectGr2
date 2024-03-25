package tests.FilterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;


public class FilterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(FilterTest.class);


    @Test
    public void Filter() {

        LOG.info("Accept cookies");
        filterItems.acceptCookies();
        sleep(1000L);

        LOG.info("Click the women category");
        filterItems.clickWomen();

        LOG.info("Click the filter button");
        filterItems.clickFilter();
        sleep(1000L);

        LOG.info("Filter the price from low to high");
        filterItems.setLowToHigh();
        sleep(1000L);

        LOG.info("Click the filter button");
        filterItems.clickFilter();
        sleep(1000L);

        LOG.info("Filter the price from high to low");
        filterItems.setHighToLow();
        sleep(1000L);

        LOG.info("Click the filter button");
        filterItems.clickFilter();
        sleep(1000L);

        LOG.info("Filter the items from A to Z");
        filterItems.setFromAtoZ();
        sleep(1000L);

    }
}
