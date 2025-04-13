package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogOutTest {
    @Test
    public void logOuttest()throws InterruptedException {
        // إعدادات المتصفح
        WebDriver driver = new ChromeDriver();
        driver.get("https://go-bus.com/?lang=en");

        WebElement loginButton = driver.findElement(By.xpath("//button[@class='btn login-btn']"));
        loginButton.click();

        // تسجيل الدخول
        WebElement emailField = driver.findElement(By.xpath("//input[@name='user-email']"));
        emailField.sendKeys("ahmedsayed@qa.team");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='user-password']"));
        passwordField.sendKeys("666777888");

        WebElement x = driver.findElement(By.xpath("//button[@type='submit']"));
        x.click();
        Thread.sleep(5000L);
        WebElement drobmeanu =driver.findElement(By.xpath("//h4[normalize-space()='My Account']"));
        drobmeanu.click();
        Thread.sleep(5000L);
        WebElement logout = driver.findElement(By.xpath("//a[normalize-space()='Sign Out']"));
        logout.click();



        driver.quit();
    }
}
