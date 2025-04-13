package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class Search {

   private WebDriver x;


    @BeforeMethod

    public void login() throws InterruptedException{
        x=new ChromeDriver();
        x.manage().window().maximize();
        x.navigate().to("https://go-bus.com/?lang=en");
        x.findElement(By.xpath("//button[@class='btn login-btn']")).click();
        x.findElement(By.xpath("//input[@name='user-email']")).sendKeys("gobusgo123@gmail.com");
        x.findElement(By.xpath("//input[@name='user-password']")).sendKeys("gobusgo123@");
        x.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000L);
   }




 @Test(priority = 1)

    public void testcase01() throws InterruptedException{
     x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
     x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
     x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
     x.findElement(By.xpath("//button[text()='Show Trips']")).click();
     Thread.sleep(6000);

 }

    @Test(priority = 2)

    public void testcase02() throws InterruptedException{

        x.findElement(By.xpath("//div[@class='hero']//div[2]//div[1]//div[1]//div[1]")).click();
        x.findElement(By.xpath("//li[normalize-space()='MarsaMatrouh']")).click();
        x.findElement(By.xpath("//ul[@class='browse-select-options subgroup active']//li[contains(text(),'Marsa Matrouh')]")).click();
        x.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='HomePage']/div[@class='hero']/div[@class='container']/div[@class='hero-con']/form[@action='single-routs.html']/div[@id='bus']/div[@class='trip-choise-con']/div[2]/div[1]/div[1]")).click();
        x.findElement(By.xpath("//li[normalize-space()='Nady El sekka']")).click();
        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(6000);

    }

    @Test(priority = 3)

    public void testcase03() throws InterruptedException{

        x.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='HomePage']/div[@class='hero']/div[@class='container']/div[@class='hero-con']/form[@action='single-routs.html']/div[@id='bus']/div[@class='trip-choise-con']/div[2]/div[1]/div[1]")).click();
        x.findElement(By.xpath("//div[@class='browse-select-div active']//li[contains(text(),'Aswan')]")).click();
        x.findElement(By.xpath("//div[@class='hero']//div[2]//div[1]//div[1]//div[1]")).click();
        x.findElement(By.xpath("//div[@class='browse-select-div active']//li[contains(text(),'Aswan')]")).click();
        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(6000);

    }
    @Test(priority = 4)

    public void testcase04() throws InterruptedException{

        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//i[normalize-space()='remove']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(6000);
    }
    @Test(priority = 5)

    public void testcase05() throws InterruptedException{

        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//i[normalize-space()='add']")).click();
        x.findElement(By.xpath("//i[normalize-space()='add']")).click();
        x.findElement(By.xpath("//i[normalize-space()='add']")).click();
        x.findElement(By.xpath("//i[normalize-space()='add']")).click();
        x.findElement(By.xpath("//i[normalize-space()='add']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(6000);


    }
    @Test(priority = 6)

    public void testcase06() throws InterruptedException{


        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//p[contains(@class,'msgSelect')]")).click();
        x.findElement(By.xpath("//div[@aria-label='Fri May 02 2025']")).click();
        x.findElement(By.xpath("//i[normalize-space()='add']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(6000);

    }

    @Test(priority = 7)

    public void testcase07() throws InterruptedException{

        x.findElement(By.xpath("//input[@type='text']")).click();
        x.findElement(By.xpath("//div[@role='grid']")).click();
        System.out.println("valid 7");
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(7000);
    }
    @Test(priority = 8)

    public void testcase08() throws InterruptedException{
        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(5000L);
        x.findElement(By.xpath("//div[4]//div[1]//div[2]//div[1]//button[1]//h6[1]")).click();
        x.findElement(By.xpath("//a[contains(@class,'btn')]")).click();
        Thread.sleep(5000L);
        x.findElement(By.xpath("//span[normalize-space()='2']")).click();
        x.findElement(By.xpath("//button[@class='btn']")).click();
        Thread.sleep(5000L);
        x.findElement(By.xpath("//i[normalize-space()='radio_button_unchecked']")).click();
        x.findElement(By.xpath("//i[normalize-space()='check_box_outline_blank']")).click();
        x.findElement(By.xpath("//span[normalize-space()='Book now']")).click();
        Thread.sleep(5000L);
    }
    @Test(priority = 9)

    public void testcase09() throws InterruptedException {
        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//div[@aria-label='Mon Apr 14 2025']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(5000L);
        x.findElement(By.xpath("//div[4]//div[1]//div[2]//div[1]//button[1]//h6[1]")).click();
        x.findElement(By.xpath("//a[@class='btn']")).click();
        Thread.sleep(5000);
        x.findElement(By.xpath("//span[normalize-space()='5']")).click();
        x.findElement(By.xpath("//button[@class='btn']")).click();
        Thread.sleep(5000);

    }


    @Test(priority = 10)

    public void testcase10() throws InterruptedException{

        x.findElement(By.xpath("//input[contains(@type,'text')]")).click();
        x.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        x.findElement(By.xpath("//div[@aria-label='Thu May 01 2025']")).click();
        x.findElement(By.xpath("//p[contains(@class,'msgSelect')]")).click();
        x.findElement(By.xpath("//div[@aria-label='Fri May 02 2025']")).click();
        x.findElement(By.xpath("//button[text()='Show Trips']")).click();
        Thread.sleep(3000L);
        x.findElement(By.xpath("//div[@class='trip-route-con']//div[1]//div[4]//div[1]//div[2]//div[1]//button[1]//h6[1]")).click();
        Thread.sleep(3000L);
        x.findElement(By.xpath("//div[@class='list-component']//div[2]//div[4]//div[1]//div[2]//div[1]//button[1]//h6[1]")).click();
        x.findElement(By.xpath("//a[@class='btn']")).click();
        Thread.sleep(6000L);
        x.findElement(By.xpath("//button[@class='btn']")).click();
        Thread.sleep(5000L);
        x.findElement(By.xpath("//i[normalize-space()='radio_button_unchecked']")).click();
        Thread.sleep(5000L);
        x.findElement(By.xpath("//i[normalize-space()='check_box_outline_blank']")).click();
        x.findElement(By.xpath("//span[normalize-space()='Book now']")).click();
        Thread.sleep(3000L);
  }





    @AfterMethod
    public void end() {
   x.quit();
 }
 
}

