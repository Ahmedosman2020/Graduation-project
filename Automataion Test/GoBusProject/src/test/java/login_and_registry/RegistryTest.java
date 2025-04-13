package login_and_registry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import java.time.Duration;

public class RegistryTest {
    private WebDriver google;
    private WebDriverWait wait;
    private ExpectedConditions ExpectedConditions;

    @BeforeMethod
    public void EntreSite() {
        System.out.println("Starting test: Opening browser and navigating to site...");
        google = new ChromeDriver();
        google.manage().window().maximize();
        google.navigate().to("https://go-bus.com/?lang=en");
        google.findElement(LoginElements.elemnt.loginButton).click();
        google.findElement((LoginElements.elemnt.newRegister)).click();
        wait = new WebDriverWait(google, Duration.ofSeconds(5));
        System.out.println("Successfully navigated to registration page.");
    }

    @Test(priority = 1 )
    public void TestCase01ValidData()  {
        System.out.println("Executing Test Case 01 Verify that the name field with valid name ");
        google.findElement(LoginElements.elemnt.name).sendKeys("haledMhad");
        google.findElement(LoginElements.elemnt.phone).sendKeys("01033566645");
        google.findElement(LoginElements.elemnt.email).sendKeys(" dfwe44670@gmail.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();

    }

    @Test(priority = 2)
    public void TESTCase02SameData()  {
        System.out.println("Executing Test Case 02  Verify that not RegistryTest same date ");
        google.findElement(LoginElements.elemnt.name).sendKeys("haledMhad");
        google.findElement(LoginElements.elemnt.phone).sendKeys("01033566645");
        google.findElement(LoginElements.elemnt.email).sendKeys(" dfwe44670@gmail.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 02");
    }
   @Test(priority = 3)
   public void TESTCase03FieldNameNotAcceptedNumber()  {
    System.out.println("Executing Test Case 03 Verify that the name field not accepted number");
      google.findElement(LoginElements.elemnt.name).sendKeys("Jackson Potter123");
      google.findElement(LoginElements.elemnt.phone).sendKeys(" 01044775688");
      google.findElement(LoginElements.elemnt.email).sendKeys(" tyui@gmail.com");
      google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
      google.findElement(LoginElements.elemnt.registerButton).click();
       System.out.println("test Excute 03");

    }
    @Test(priority = 4)
    public void TESTCase04NotAcceptedBlankField()  {
        System.out.println("Executing Test Case 04Verify that the name field not accepted blank field");
        google.findElement(LoginElements.elemnt.name).sendKeys("");
        google.findElement(LoginElements.elemnt.phone).sendKeys(" 01044775688");
        google.findElement(LoginElements.elemnt.email).sendKeys(" nonummy@gmail.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 04");
    }

    @Test(priority = 5)
    public void TESTCase05NotAcceptedLetter()  {
        System.out.println("Verify that the phone number field not accepted letter");
        google.findElement(LoginElements.elemnt.name).sendKeys("Guy Valentine");
        google.findElement(LoginElements.elemnt.phone).sendKeys("  01022380788 A");
        google.findElement(LoginElements.elemnt.email).sendKeys(" olp09@gmail.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 05");
    }

    @Test(priority = 6)
    public void TESTCase06NotAcceptedInvalidLength()  {
        System.out.println("Verify that the phone number field not accepted invalid length ");
        google.findElement(LoginElements.elemnt.name).sendKeys("Emerson Vazquez");
        google.findElement(LoginElements.elemnt.phone).sendKeys("09876");
        google.findElement(LoginElements.elemnt.email).sendKeys("tgb89@explme.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 06");
    }
    @Test(priority = 7)
    public void TESTCase07NotAcceptedBlankField()  {
        System.out.println("Verify that the phone number field not accepted blank field ");
        google.findElement(LoginElements.elemnt.name).sendKeys("Tara Kinney");
        google.findElement(LoginElements.elemnt.phone).sendKeys("");
        google.findElement(LoginElements.elemnt.email).sendKeys("okmnju@gmail.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 07");
    }

    @Test(priority = 8)
    public void TESTCase08InvalidEmail()  {
        System.out.println("Verify that the email field only accepts valid email addresses\n" +
                " from known services (e.g., Gmail, Yahoo) and rejects temporary email services. ");
        google.findElement(LoginElements.elemnt.name).sendKeys("talon Hansen");
        google.findElement(LoginElements.elemnt.phone).sendKeys("01066380788");
        google.findElement(LoginElements.elemnt.email).sendKeys("YYYYYY@gttmm.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 08");
    }

    @Test(priority = 9)
    public void TESTCase09NotAcceptedBlankField()  {
        System.out.println("Verify that the e-mail field not accepted blank field");
        google.findElement(LoginElements.elemnt.name).sendKeys("Amena Hendrixn");
        google.findElement(LoginElements.elemnt.phone).sendKeys(" 010123807868");
        google.findElement(LoginElements.elemnt.email).sendKeys(" ");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 09");
    }
    @Test(priority = 10)
    public void TESTCase10WeekPassword()  {
        System.out.println("Verify that the password  field not accpted week password");
        google.findElement(LoginElements.elemnt.name).sendKeys(":Blythe Carter");
        google.findElement(LoginElements.elemnt.phone).sendKeys(" 01022342788");
        google.findElement(LoginElements.elemnt.email).sendKeys("estaaa@google.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("storge@1278");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 10");
    }
    @Test(priority = 11)
    public void TESTCase11BlankPassword()  {
        System.out.println("Verify that password field not accpted blank field");
        google.findElement(LoginElements.elemnt.name).sendKeys(":Brent Fisher");
        google.findElement(LoginElements.elemnt.phone).sendKeys("  01262380888");
        google.findElement(LoginElements.elemnt.email).sendKeys(" aaaftlli@gmail.com");
        google.findElement(LoginElements.elemnt.password).sendKeys("");
        google.findElement(LoginElements.elemnt.registerButton).click();
        System.out.println("test Excute 11");
    }

    //Verify

    @AfterMethod
    public void verifyAccountCreation() {
        try {
            // wait meau of account display
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








