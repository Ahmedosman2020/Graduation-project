package homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class MenuAndSidebarTests {
    private WebDriver driver;
    private WebDriverWait wait;
    HomePageElements homePageElements;


    @BeforeTest
    public void open_GoBus() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://go-bus.com/?lang=en");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        homePageElements = new HomePageElements(driver);
    }
    //    ****************                 Menutab Testcases         *********************

    @Test(priority = 1)
    public void testHomeTabNavigation() {
        homePageElements.clickHomeTab();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String currentUrl = homePageElements.getCurrentPageUrl();
        Assert.assertTrue(currentUrl.contains("/?lang=en"));
    }

    @Test(priority = 2)
    public void testTravelDestinationTabNavigation() {
        homePageElements.clickTravelDestinationTab();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String currentUrl = homePageElements.getCurrentPageUrl();
        Assert.assertTrue(currentUrl.contains("/destinations"));
    }

    @Test(priority = 3)
    public void testGoBusStationsTabNavigation() {
        homePageElements.clickGoBusStationsTab();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String currentUrl = homePageElements.getCurrentPageUrl();
        Assert.assertTrue(currentUrl.contains("/stations"));
    }

//    ****************                 Sidebar Testcases         *********************
    @Test(priority = 4)
    public void testSidebarCompanyNavigation() {
        homePageElements.clickFaq();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        homePageElements.clickSidebarCompany();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().contains("/about"));
    }


    @Test(priority = 5)
    public void testSidebarPolicyNavigation() {
        homePageElements.clickFaq();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/policy'])[3]")));
        homePageElements.clickSidebarPolicy();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().contains("/policy"));
    }

    @Test(priority = 6)
    public void testSidebarTermsNavigation() {
        homePageElements.clickCompany();
        homePageElements.clickSidebarTerms();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().contains("/terms"));
    }

    @Test(priority = 7)
    public void testSidebarContactUsNavigation() {
        homePageElements.clickSidebarContactUs();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().toLowerCase().contains("/contact-us"));
    }

    @AfterTest
    private void close_Browser(){
        driver.quit();
    }
}