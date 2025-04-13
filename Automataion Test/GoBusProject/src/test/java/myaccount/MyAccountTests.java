package myaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyAccountTests {

    WebDriver driver;
    
    @BeforeClass
    public void setup() throws InterruptedException {
         driver = new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        driver.get("https://go-bus.com/?lang=en");
        driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
        driver.findElement(By.xpath("//input[@name='user-email']")).sendKeys("ahmedsayed@qa.team");
        driver.findElement(By.xpath("//input[@name='user-password']")).sendKeys("666777888");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000L);
    }

    @Test
    public void updateProfileWithValidData() throws InterruptedException {
        // Fill in new data

        driver.findElement(By.xpath("//i[normalize-space()='arrow_drop_down']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='My Account']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).clear();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Nada N. Shaban");

        driver.findElement(By.xpath("//input[@name='phone-number']")).clear();
        driver.findElement(By.xpath("//input[@name='phone-number']")).sendKeys("01069065959");

        driver.findElement(By.xpath("//input[@name='email']")).clear();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nn1254@fayoum.edu.eg");

        // Click Edit
        driver.findElement(By.xpath("//button[@type='button']")).click();

//        Thread.sleep(10);  // مدة الانتظار 10 ثواني
        System.out.println("✅ Updated profile with valid data");
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

