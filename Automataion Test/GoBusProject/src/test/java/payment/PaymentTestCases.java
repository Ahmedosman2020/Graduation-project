package payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class PaymentTestCases {

    private WebDriver driver;
    public WebDriverWait wait;

    @BeforeTest
    public void open_Go_Bus() throws Exception {

        //Login
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://go-bus.com/?lang=en");
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        this.driver.findElement(Elements.elements.loginButton).click();
        this.driver.findElement(Elements.elements.emailField).sendKeys(new CharSequence[]{"ahmedsa@qa.team"});
        this.driver.findElement(Elements.elements.passwordField).sendKeys(new CharSequence[]{"666777888"});
        this.driver.findElement(Elements.elements.submitButton).click();
        Thread.sleep(2000L);

        //Booking
        this.driver.findElement(Elements.elements.departureDateButton).click();
        this.driver.findElement(Elements.elements.departureDayButton).click();
        this.driver.findElement(Elements.elements.showTripsButton).click();
        Thread.sleep(2000L);
        this.driver.findElement(Elements.elements.chooseTripsButton).click();
        this.driver.findElement(Elements.elements.bookSeatButton).click();
        Thread.sleep(2000L);
        this.driver.findElement(Elements.elements.checkAvailabilityButton).click();
        Thread.sleep(2000L);
    }


    @Test(priority = 1)
    public void bookingForSomeoneElse() throws InterruptedException {
        this.driver.findElement(Elements.elements.bookingForSomeoneElse).click();
        Thread.sleep(2000L);
        this.driver.findElement(Elements.elements.beneficiaryName).sendKeys("Mohammed");
        this.driver.findElement(Elements.elements.beneficiaryMobileNo).sendKeys("01552625151");
        Thread.sleep(2000L);
        String actualResult = driver.findElement(Elements.elements.beneficiaryLabel).getText();
        String expectedResult = "Beneficiary Name";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 2)
    public void invalidPromoCodeValidation() throws InterruptedException {
        this.driver.findElement(Elements.elements.promoCodeField).click();
        this.driver.findElement(Elements.elements.enterPromoCode).sendKeys("456");
        this.driver.findElement(Elements.elements.discountButton).click();
        Thread.sleep(2000L);
        String actualResult = driver.findElement(Elements.elements.promoCodeValidation).getText();
        String expectedResult = "Invalid promocode";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 3)
    public void creditCardsAvailability() throws InterruptedException {
        this.driver.findElement(Elements.elements.creditCardsRadiobutton).click();
        Thread.sleep(2000L);
        String actualResult = driver.findElement(Elements.elements.creditCardsValidation).getText();
        String expectedResult = "Credit Cards";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 4)
    public void cashMachinesAvailability() {
        String actualResult = driver.findElement(Elements.elements.cashMachinesValidation).getText();
        String expectedResult = "Cash Machines";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 5)
    public void unCheckedTermsAndConditionsValidation() throws InterruptedException {
        this.driver.findElement(Elements.elements.bookNowButton).click();
        Thread.sleep(2000L);
        String actualResult = driver.findElement(Elements.elements.errorValidationMessage).getText();
        String expectedResult = "- Please accept the terms & conditions";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 6)
    public void termsAndConditionsValidation() throws InterruptedException {
        this.driver.findElement(Elements.elements.termsAndConditionsCheckBox).click();
        Thread.sleep(2000L);
        this.driver.findElement(Elements.elements.bookNowButton).click();
        Thread.sleep(2000L);
        String actualResult = driver.findElement(Elements.elements.errorValidationMessage).getText();
        String expectedResult = "- Please enter the credit card number";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 7)
    public void emptyCreditCardNumberField() throws InterruptedException {
        this.driver.findElement(Elements.elements.termsAndConditionsCheckBox).click();
        Thread.sleep(2000L);
        this.driver.findElement(Elements.elements.termsAndConditionsCheckBox).click();
        this.driver.findElement(Elements.elements.bookNowButton).click();
        Thread.sleep(2000L);
        String actualResult = driver.findElement(Elements.elements.errorValidationMessage).getText();
        String expectedResult = "- Please enter the credit card number";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 8)
    public void totalCostDisplaying() {
        String actualResult = driver.findElement(Elements.elements.totalCost).isEnabled() ? "true" : "false";
        Assert.assertTrue(actualResult.contains("true"));
    }

    @Test(priority = 9)
    public void reportBugFunction() throws InterruptedException {
        this.driver.findElement(Elements.elements.reportBugFunction).click();
        Thread.sleep(4000L);
        String actualResult = driver.findElement(Elements.elements.reportBugValidation).isDisplayed() ? "true" : "false";
        Assert.assertTrue(actualResult.contains("true"));
    }


    @AfterTest
    public void close_Browser() {
        driver.quit();
    }
}
