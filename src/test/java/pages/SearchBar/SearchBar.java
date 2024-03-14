package pages.SearchBar;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.SelectItems.ItemsPage;


public class SearchBar extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchBar.class);
    public static SearchBar instance;

    private SearchBar() {

    }

    public static SearchBar getInstance() {
        if (instance == null) {
            instance = new SearchBar();
        }
        return instance;
    }

    private By clickSearchBar = By.xpath("//div[@class='header-search right']//span[contains(text(),'Caută')]");
    private By writeSearch = By.xpath("//div[@id='search-overlay']//input[@placeholder='Caută Produse']");
    private By setItem = By.xpath("/html[1]/body[1]/div[2]/header[1]/div[2]/div[1]/form[1]/ul[1]/li[1]/a[1]");


    public void openSearch(){
        LOG.info("Open searchbar");
        driver.findElement(clickSearchBar).click();
    }

    public void wSearch(String item){
        LOG.info("Click the search");
        driver.findElement(writeSearch).sendKeys(item);
    }

    public void selItem(){
        LOG.info("Select the item");
        driver.findElement(setItem).click();
    }

}
