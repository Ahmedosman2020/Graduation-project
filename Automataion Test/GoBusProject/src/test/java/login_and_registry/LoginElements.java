package login_and_registry;

import org.openqa.selenium.By;


public class LoginElements {
    public static class elemnt {
        static By loginButton = (By.cssSelector("button.btn.login-btn"));
        static By newRegister = (By.cssSelector(".btn.btn-new-acc"));
        static By name = (By.cssSelector("input[name='name']"));
        static By phone = (By.cssSelector("input[name='phone']"));
        static By email = (By.cssSelector("input[name='email']"));
        static By password = (By.cssSelector("input[type='password']"));
        static By registerButton = (By.cssSelector("button.btn.btnSubmit"));
        static By dropMeau = (By.xpath("//div[@class='pm-btn']"));
        static By accountMeau = (By.xpath("//a[normalize-space()='My Account']"));
        static By myProfileHeader = (By.xpath("//h1[text()='My Profile']"));
        static By username = (By.xpath("//input[@name='user-email']"));
        static By pass = (By.xpath("//input[@name='user-password']"));
        static By login = (By.xpath("//button[@type='submit']"));
    }
}

