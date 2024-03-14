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

        searchBar.openSearch();
        sleep(1000L);

        searchBar.wSearch(item);
        sleep(2000L);

        searchBar.selItem();
        sleep(2000L);


    }



}
