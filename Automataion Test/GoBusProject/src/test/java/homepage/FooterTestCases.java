package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;


public class FooterTestCases {
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

    @Test(priority = 1)
    public void testFooterSectionDisplayed() {
        Assert.assertTrue(homePageElements.isFooterDisplayed(), "Footer is not visible.");
    }

    @Test(priority = 2)
    public void testLogoDisplayed() {
        Assert.assertTrue(homePageElements.isLogoDisplayed(), "Logo is not visible in footer.");
    }

    @Test(priority = 3)
    public void testTermsLink() {
        homePageElements.clickTerms();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(driver.getCurrentUrl().contains("/terms"), "Terms link did not navigate correctly.");
    }

    @Test(priority = 4)
    public void testContactUsLink() {
        homePageElements.clickContactUs();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(driver.getCurrentUrl().contains("/contact-us"), "Contact Us link failed.");
    }

    @Test(priority = 5)
    public void testBookBusLink() {
        homePageElements.clickBookBus();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(driver.getCurrentUrl().equals("https://go-bus.com/?lang=en"), "Book Bus link failed.");
    }

    @Test(priority = 6)
    public void testGoBusNewsLink() {
        homePageElements.clickGoBusNews();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Assert.assertTrue(driver.getCurrentUrl().contains("/blog"), "Go Bus News link failed.");
    }

    @Test(priority = 7)
    public void testFacebookIcon() {
        homePageElements.clickFacebook();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        switchToNewTabAndVerify("facebook.com/p/GoBus");
    }

    @Test(priority = 8)
    public void testInstagramIcon() {
        homePageElements.clickInstagram();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        switchToNewTabAndVerify("gobusegypt");
    }

    @Test(priority = 9)
    public void testYoutubeIcon(){
        homePageElements.clickYoutube();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        switchToNewTabAndVerify("GoBusEgypt");
    }

    @Test(priority = 10)
    public void testLinkedinIcon() {
        homePageElements.clickLinkedin();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        switchToNewTabAndVerify("gobusegypt");
    }

    //  method for tab switching
    private void switchToNewTabAndVerify(String expectedUrlPart) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        Assert.assertTrue(tabs.size() > 1, "No new tab opened.");
        try {
            driver.switchTo().window(tabs.get(1));
            String url = driver.getCurrentUrl();
            Assert.assertTrue(url.contains(expectedUrlPart));
        } finally {
            driver.close(); // Close new tab
            driver.switchTo().window(tabs.get(0)); // Always return to main tab
        }
    }

    @AfterTest
    private void close_Browser(){
        driver.quit();
    }


}
