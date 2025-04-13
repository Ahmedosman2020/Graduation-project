package payment;

import org.openqa.selenium.By;

public class Elements {

    public static class elements {

        //Login elements
        static By loginButton = By.xpath("//button[@class='btn login-btn']");
        static By emailField = By.xpath("//input[@name='user-email']");
        static By passwordField = By.xpath("//input[@name='user-password']");
        static By submitButton = By.xpath("//button[@type='submit']");

        //Booking elements
        static By showTripsButton = By.xpath("//button[normalize-space()='Show Trips']");
        static By departureDateButton = By.xpath("//input[contains(@type,'text')]");
        static By departureDayButton = By.xpath("//div[@aria-label='Sat Apr 19 2025']");
        static By chooseTripsButton = By.xpath("//button[@class='btn' and .//h6[normalize-space()='Choose Trip']]");
        static By bookSeatButton = By.xpath("//a[contains(@class,'btn')]");
        static By checkAvailabilityButton = By.xpath("(//button[@class='btn'])[1]");

        //Payment elements

        public static By creditCardsRadiobutton = By.xpath("//i[normalize-space()='radio_button_checked']");
        public static By promoCodeField = By.xpath("//div[@class='tickets-component']//div//div//div[@class='calc-ticket']//button[@class='addCode']");
        public static By enterPromoCode = By.xpath("//div[@class='tickets-component-con']//input[@type='text']");
        public static By discountButton = By.xpath("//a[normalize-space()='Discount']");
        public static By promoCodeValidation = By.xpath("//i[normalize-space()='Invalid promocode']");
        static By bookingForSomeoneElse = By.xpath("//span[@class='switch-icon']");
        static By beneficiaryName= By.xpath("//div[@class='book-for-form']//input[@type='text']");
        static By beneficiaryMobileNo= By.xpath("//input[@type='tel']");
        static By beneficiaryLabel= By.xpath("//div[@class='book-for']//div[2]//label[1]");
        public static By termsAndConditionsCheckBox = By.xpath("//span[normalize-space()='Accept all']");
        public static By bookNowButton = By.xpath("//span[normalize-space()='Book now']");
        public static By errorValidationMessage = By.xpath("//div[@style='margin-right: 35px;']//div[@class='error-validition']/p");
        public static By creditCardsValidation = By.xpath("//div[@class='widget-head']//a[1]");
        public static By totalCost = By.cssSelector("div.tickets-component-con div.price-txt > p");
        public static By cashMachinesValidation = By.xpath("//div[normalize-space()='Cash Machines']");
        public static By reportBugFunction = By.xpath("//a[@id='atlwdg-trigger']");
        public static By reportBugValidation = By.xpath("//div[@id='atlwdg-blanket']");

    }
}







