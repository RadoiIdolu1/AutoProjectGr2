package tests.SearchBarTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;


public class SearchBarTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBarTest.class);

    String item = "Nike Air Force 1";

    @Test

    public void searchBar() {

        LOG.info("Accept cookies");
        searchBar.acceptCookies();
        sleep(1000L);

        LOG.info("Open the searchbar");
        searchBar.openSearch();
        sleep(2000L);

        LOG.info("Write in the searchbar a product");
        searchBar.wSearch(item);
        sleep(3000L);

        LOG.info("Select the item");
        searchBar.selItem();
        sleep(3000L);


    }



}
