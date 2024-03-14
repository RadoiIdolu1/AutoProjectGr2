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

        filterItems.clickWomen();

        filterItems.clickFilter();
        sleep(1000L);

        filterItems.setLowToHigh();
        sleep(1000L);

        filterItems.clickFilter();
        sleep(1000L);

        filterItems.setHighToLow();
        sleep(1000L);

        filterItems.clickFilter();
        sleep(1000L);

        filterItems.setFromAtoZ();
        sleep(1000L);

    }
}
