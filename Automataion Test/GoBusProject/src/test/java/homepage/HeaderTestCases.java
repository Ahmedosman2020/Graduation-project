package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class HeaderTestCases {
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

    //header test cases             Display
    @Test(priority = 1)
    public void testLogoIsDisplayed() {
        Assert.assertTrue(homePageElements.isLogoDisplayed(), "Logo is not displayed.");
    }

    @Test(priority = 2)
    public void testFaqLinkIsDisplayed() {
        Assert.assertTrue(homePageElements.isFaqLinkDisplayed(), "FAQ link is not displayed.");
    }

    @Test(priority = 3)
    public void testCompanyLinkIsDisplayed() {
        Assert.assertTrue(homePageElements.isCompanyLinkDisplayed(), "Company link is not displayed.");
    }

    @Test(priority = 4)
    public void testContactLinkIsDisplayed() {
        Assert.assertTrue(homePageElements.isContactLinkDisplayed(), "Contact link is not displayed.");
    }

    @Test(priority = 5)
    public void testLanguageSwitcherIsDisplayed() {
        Assert.assertTrue(homePageElements.isLanguageSwitcherDisplayed(), "Language switcher is not displayed.");
    }

    //header test cases             navigation

    @Test(priority = 6)
    public void testFaqNavigation() {
        homePageElements.clickFaq();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().contains("faq"), "FAQ navigation failed.");
    }

    @Test(priority = 7)
    public void testCompanyNavigation(){
        homePageElements.clickCompany();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().toLowerCase().contains("about"), "About navigation failed.");
    }

    @Test(priority = 8)
    public void testContactNavigation(){
        homePageElements.clickContact();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(homePageElements.getCurrentUrl().toLowerCase().contains("contact"));
    }
    @Test(priority = 9)
    public void testSwitchToArabic(){
        homePageElements.switchToArabic();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        String actual = driver.findElement(By.xpath("(//a[@href='/about'])[2]")).getText();
        String expected = "عن الشركة";
        Assert.assertTrue(actual.contains(expected));
    }



    @AfterTest
    private void close_Browser(){
        driver.quit();
    }

}

