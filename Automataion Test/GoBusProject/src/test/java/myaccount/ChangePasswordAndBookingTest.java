package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ChangePasswordAndBookingTest {
    WebDriver driver;

    // Setup method to initialize the WebDriver and perform login
    @BeforeClass
    public void setup() throws InterruptedException {

        driver = new ChromeDriver();

        driver.get("https://go-bus.com/?lang=en");

        // Click the login button
        driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();

        // Enter email and password
        driver.findElement(By.xpath("//input[@name='user-email']")).sendKeys("ahmedsayed@qa.team");
        driver.findElement(By.xpath("//input[@name='user-password']")).sendKeys("666777888");

        // Click the login submit button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);


    }

    // Test to verify changing password
    @Test(priority=2)
    public void testChangePassword() throws InterruptedException {


        driver.findElement(By.xpath("//i[normalize-space()='arrow_drop_down']")).click();
        Thread.sleep(5000L);
        // Click on "Change Password" link
        driver.findElement(By.xpath("//a[normalize-space()='Change Password']")).click();


        // Change password
        WebElement currentPasswordField = driver.findElement(By.xpath("//input[@name='old_password']"));
        WebElement newPasswordField = driver.findElement(By.xpath("//input[@name='new_password']"));
        WebElement retypePasswordField = driver.findElement(By.xpath("//input[@name='verify_password']"));
        WebElement confirmButton = driver.findElement(By.xpath("//button[@type='button']"));

        currentPasswordField.sendKeys("666777888");
        newPasswordField.sendKeys("6667778888");
        retypePasswordField.sendKeys("6667778888");
        confirmButton.click();


    }

    // Test to verify booking functionality
    @Test(priority=1)
    public void testBookingFunctionality() throws InterruptedException {
        // Navigate to "My Bookings"
        driver.findElement(By.xpath("//i[normalize-space()='arrow_drop_down']")).click();
        Thread.sleep(5000L);


        driver.findElement(By.xpath("//div[@class='pm-menu active']//a[normalize-space()='My Bookings']")).click();
        Thread.sleep(5000);





    }
    @Test(priority=3)
    public void testCancelBookingButtonNotAvailable() throws InterruptedException {
        // Navigate to "My Bookings"
        driver.findElement(By.xpath("//i[normalize-space()='arrow_drop_down']")).click();
        Thread.sleep(5000L);

        driver.findElement(By.xpath("//div[@class='pm-menu active']//a[normalize-space()='My Bookings']")).click();
        Thread.sleep(5000);

        // Verify booking is displayed
        WebElement bookingCard = driver.findElement(By.xpath("//h5[normalize-space()='Booking No.']"));
        assert bookingCard.isDisplayed();

        // Try to locate the Cancel button inside the booking card
        List<WebElement> cancelButtons = driver.findElements(By.xpath("//button[normalize-space()='Cancel']"));

        // Assert that the Cancel button is NOT displayed
        assert cancelButtons.size() == 0 : "Cancel button is unexpectedly available for a booked trip.";

    }
    @Test(priority=4)
    public void testCancelButtonShouldBeAvailable() throws InterruptedException {
        // Navigate to "My Bookings"
        driver.findElement(By.xpath("//i[normalize-space()='arrow_drop_down']")).click();
        Thread.sleep(5000L);

        driver.findElement(By.xpath("//div[@class='pm-menu active']//a[normalize-space()='My Bookings']")).click();
        Thread.sleep(5000);

        // Verify booking is displayed
        WebElement bookingCard = driver.findElement(By.xpath("//h5[normalize-space()='Booking No.']"));
        assert bookingCard.isDisplayed();

        // Try to locate the Cancel button
        List<WebElement> cancelButtons = driver.findElements(By.xpath("//button[normalize-space()='Cancel']"));

        // Assert that the Cancel button IS displayed (if not = test fails = Bug)
        assert cancelButtons.size() > 0 : "❌ Bug Detected: Cancel button is not available but it should be!";
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
