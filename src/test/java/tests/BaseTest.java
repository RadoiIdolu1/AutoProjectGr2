package tests;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.Newsletter.Newsletter;
import pages.Register.RegisterPage;
import pages.FilterPage.FilterPage;
import pages.SearchBar.SearchBar;
import pages.SelectItems.ItemsPage;
import pages.SignInPage.SignInPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public ItemsPage itemsPage = ItemsPage.getInstance();
    public FilterPage filterItems = FilterPage.getInstance();
    public Newsletter fillNewsletter = Newsletter.getInstance();
    public SearchBar searchBar = SearchBar.getInstance();

    @BeforeSuite
    public void init(){

        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown(){

        BasePage.close();
    }

}
