package login_and_registry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
public class LoginTest {
    private WebDriver google;
    private WebDriverWait wait;

    @BeforeMethod
    public void EntreSite() {
        google = new ChromeDriver();
        google.manage().window().maximize();
        google.navigate().to("https://go-bus.com/?lang=en");
        wait = new WebDriverWait(google, Duration.ofSeconds(5));
        google.findElement(LoginElements.elemnt.loginButton).click();
    }

    @Test(priority = 1 )
    public void TESTCase12ValidEmailValidPassword()  {
        System.out.println("LoginTest with Valid Email and Valid Password ");
        google.findElement(LoginElements.elemnt.username).sendKeys("dfwe44670@gmail.com");
        google.findElement(LoginElements.elemnt.pass).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.login).click();
        System.out.println("Execute test 12.");

    }
    @Test(priority = 2 )
    public void TESTCase13InvalidEmailInvalidPassword()  {
        System.out.println("LoginTest with invalid Email and invalid Password ");
        google.findElement(LoginElements.elemnt.username).sendKeys(".augue.malesuada@icloud.couk");
        google.findElement(LoginElements.elemnt.pass).sendKeys("11111");
        google.findElement(LoginElements.elemnt.login).click();
        System.out.println("Execute test 13.");

    }
    @Test(priority = 3 )
    public void TESTCase14InvalidEmailValidPassword()  {
        System.out.println("LoginTest with inValid Email and Valid Password");
        google.findElement(LoginElements.elemnt.username).sendKeys("auctor@hotmail.com");
        google.findElement(LoginElements.elemnt.pass).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.login).click();
        System.out.println("Execute test 14.");

    }
    @Test(priority = 4 )
    public void TESTCase15ValidEmailInvalidPassword()  {
        System.out.println("LoginTest with Valid Email and invalid Password");
        google.findElement(LoginElements.elemnt.username).sendKeys("nequee@gmail.com");
        google.findElement(LoginElements.elemnt.pass).sendKeys("111111");
        google.findElement(LoginElements.elemnt.login).click();
        System.out.println("Execute test 15.");

    }
    @Test(priority = 5 )
    public void TESTCase16BlankEmail()  {
        System.out.println("LoginTest with blank Email and valid Password");
        google.findElement(LoginElements.elemnt.username).sendKeys("");
        google.findElement(LoginElements.elemnt.pass).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.login).click();
        System.out.println("Execute test 15.");

    }
    @Test(priority = 6 )
    public void TESTCase17BlankPassword()  {
        System.out.println("LoginTest with valid Email and empty Password");
        google.findElement(LoginElements.elemnt.username).sendKeys("nequee@gmail.com");
        google.findElement(LoginElements.elemnt.pass).sendKeys("");
        google.findElement(LoginElements.elemnt.login).click();
        System.out.println("Execute test 15.");

    }


    //Verify

    @AfterMethod
    public void verifyAccountCreation() {
        try {
            // wait menu of account display
            WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(LoginElements.elemnt.dropMeau));
            menu.click();
            // wait to account display
            WebElement accountMenu = wait.until(ExpectedConditions.elementToBeClickable(LoginElements.elemnt.accountMeau));
            accountMenu.click();
            if (google.findElement(LoginElements.elemnt.myProfileHeader).isDisplayed() == true){
                System.out.println("pass test case.");
            } else {
                System.out.println("fail test case");
            }
        } catch (Exception e) {
            System.out.println("Fail"+e.getMessage());
        } finally {
            if (google != null) {
                google.quit();
                System.out.println("Browser closed." );
            }

        }
    }
    @AfterTest
    public void closeBrowserTest() {
        google.quit();
    }
}