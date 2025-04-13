package routes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Routes {
    WebDriver google ;

    @BeforeMethod
    public void enterSite() {
        google= new ChromeDriver();
        google.manage().window().maximize();
        google.navigate().to("https://go-bus.com/");

    }

    @Test (priority = 1)
    public void testCase01() {
    google.findElement(By.xpath("//a[contains(text(),'الاسكندرية - شرم الشيخ')]")).click();

    }

    @Test (priority = 2)
    public void testCase02() {
        google.findElement(By.xpath("//a[contains(text(),'دهب - نويبع')]")).click();

    }

    @Test (priority = 3)
    public void testCase03() {
        google.findElement(By.xpath("//a[contains(text(),'دهب - شرم الشيخ')]")).click();

    }

    @Test (priority = 4)
    public void testCase04() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - اسيوط')]")).click();

    }

    @Test (priority = 5)
    public void testCase05() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - الاقصر')]")).click();

    }

    @Test (priority = 6)
    public void testCase06() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - مرسى علم')]")).click();

    }

    @Test (priority = 7)
    public void testCase07() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - بورتو ساوث بيتش')]")).click();

    }

    @Test (priority = 8)
    public void testCase08() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - بورتو السخنة')]")).click();

    }

    @Test (priority = 9)
    public void testCase09() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - الاسكندرية')]")).click();

    }

    @Test (priority = 10)
    public void testCase10() {
        google.findElement(By.xpath("//a[contains(text(),'الغردقة - دهب')]")).click();

    }

    @Test (priority = 11)
    public void testCase11() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - نويبع')]")).click();

    }

    @Test (priority = 12)
    public void testCase12() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - القصير')]")).click();

    }

    @Test (priority = 13)
    public void testCase13() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - بورتو ساوث بيتش')]")).click();

    }

    @Test (priority = 14)
    public void testCase14() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - الساحل الشمالى')]")).click();

    }

    @Test (priority = 15)
    public void testCase15() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - سفاجا')]")).click();

    }

    @Test (priority = 16)
    public void testCase16() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - الاسكندرية')]")).click();

    }

    @Test (priority = 17)
    public void testCase17() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - الغردقة')]")).click();

    }

    @Test (priority = 18)
    public void testCase18() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - كانكون')]")).click();

    }

    @Test (priority = 19)
    public void testCase19() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - مكادى')]")).click();

    }

    @Test (priority = 20)
    public void testCase20() {
        google.findElement(By.xpath("//a[contains(text(),'دهب - الاسكندرية')]")).click();

    }

    @Test (priority = 21)
    public void testCase21() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - اسيوط')]")).click();

    }

    @Test (priority = 22)
    public void testCase22() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - مرسي علم')]")).click();

    }

    @Test (priority = 23)
    public void testCase23() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - شرم الشيخ')]")).click();

    }

    @Test (priority = 24)
    public void testCase24() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - الاقصر')]")).click();

    }

    @Test (priority = 25)
    public void testCase25() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - دهب')]")).click();

    }

    @Test (priority = 26)
    public void testCase26() {
        google.findElement(By.xpath("//a[contains(text(),'القاهرة - بورتو سخنة')]")).click();

    }

   @AfterMethod
    public void closebrowser(){
        google.quit();
    }

}
