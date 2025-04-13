package routes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Classes {

    WebDriver google ;
    @BeforeMethod
    public void enterSite() {
        google= new ChromeDriver();
        google.manage().window().maximize();
        google.navigate().to("https://go-bus.com/");

    }

    @Test (priority = 1)
    public void testCase01() {
        google.findElement(By.xpath("//div[@class='page-content']//div[@class='container']//div[1]//div[1]")).click();

    }

    @Test (priority = 2)
    public void testCase02() {
        google.findElement(By.xpath("//div[@class='bus-classes-con']//div[2]//div[1]")).click();

    }

    @Test (priority = 3)
    public void testCase03() {
        google.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='HomePage']/div[@class='page-content']/div[@class='bus-classes']/div[@class='container']/div[@class='bus-classes-con']/div[3]/div[1]/img[1]")).click();

    }

    @Test (priority = 4)
    public void testCase04() {
        google.findElement(By.xpath("//div[4]//div[1]//img[1]")).click();

    }

    @Test (priority = 5)
    public void testCase05() {
        google.findElement(By.xpath("//div[@class='bus-classes']//div[5]//div[1]//ul[1]")).click();

    }

    @Test (priority = 6)
    public void testCase06() {
        google.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='HomePage']/div[@class='page-content']/div[@class='bus-classes']/div[@class='container']/div[@class='bus-classes-con']/div[6]/div[1]/img[1]")).click();

    }

    @Test (priority = 7)
    public void testCase07() {
        google.findElement(By.xpath("//div[@class='bus-classes']//div[4]//div[1]")).click();

    }

    @Test (priority = 8)
    public void testCase08() {
        google.findElement(By.xpath("//div[8]//div[1]//ul[1]")).click();

    }

    @AfterMethod
    public void closebrowser(){
        google.quit();
    }

}