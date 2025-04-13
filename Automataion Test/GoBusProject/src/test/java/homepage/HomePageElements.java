package homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageElements {

     WebDriver driver;

     public HomePageElements(WebDriver driver) {
       this.driver = driver;
    }

        // Header Elements

        static By h_logo = By.xpath("//img[@src='/images/go-bus-dark.png']");
        static By h_company = By.xpath("(//a[@href='/about'])[2]");
        static By h_faq = By.xpath("(//a[@href='/faq'])[2]");
        static By h_contact = By.xpath("(//a[@href='/contact-us'])[2]");
        static By languageSwitcher = By.cssSelector("button[class='btn']");


        // Header Actions
        //                                   1-Display
        public boolean isLogoDisplayed() {
            return driver.findElement(h_logo).isDisplayed();
        }

        public boolean isCompanyLinkDisplayed() {
            return driver.findElement(h_company).isDisplayed();
        }

        public boolean isFaqLinkDisplayed() {
            return driver.findElement(h_faq).isDisplayed();
        }

        public boolean isContactLinkDisplayed() {
            return driver.findElement(h_contact).isDisplayed();
        }

        public boolean isLanguageSwitcherDisplayed() {
            return driver.findElement(languageSwitcher).isDisplayed();
        }


        // Header Actions
        //                                   2-navigation
        public void clickFaq() {
            driver.findElement(h_faq).click();
        }

        public void clickCompany() {
            driver.findElement(h_company).click();
        }

        public void clickContact() {
            driver.findElement(h_contact).click();
        }

        public String getCurrentUrl() {
            return driver.getCurrentUrl();
        }

        public String getPageTitle() {
            return driver.getTitle();
        }
        public void switchToArabic() {

            driver.findElement(languageSwitcher).click();
        }


        // Footer Elements
        private By footerSection = By.cssSelector("footer");
        static By f_Terms = By.xpath("(//a[@href='/terms'])[3]");
        static By f_ContactUsLink = By.xpath("(//a[@href='/contact-us'])[3]");
        static By f_bookBus = By.xpath("(//a[@href='/'])[5]");
        static By f_GoBusNewsLink = By.xpath("(//a[@href='/blog'])");

        // Footer checks
        public boolean isFooterDisplayed() {
            return driver.findElement(footerSection).isDisplayed();
        }

        // Click methods for internal footer links
        public void clickTerms() {
            driver.findElement(f_Terms).click();
        }

        public void clickContactUs() {
            driver.findElement(f_ContactUsLink).click();
        }

        public void clickBookBus() {
            driver.findElement(f_bookBus).click();
        }

        public void clickGoBusNews() {
            driver.findElement(f_GoBusNewsLink).click();
        }


        // Social media icons
        private By facebookIcon = By.cssSelector("img[alt='facebook icon']");
        private By instagramIcon = By.cssSelector("img[alt='instagram icon']");
        private By youtubeIcon = By.cssSelector("img[alt='youtube icon']");
        private By linkedinIcon = By.cssSelector("img[alt='linkedin icon']");

        // Social media actions

        public void clickFacebook() {
            driver.findElement(facebookIcon).click();
        }

        public void clickInstagram() {
            driver.findElement(instagramIcon).click();
        }

        public void clickYoutube() {
            driver.findElement(youtubeIcon).click();
        }

        public void clickLinkedin() {
            driver.findElement(linkedinIcon).click();
        }
    // Locators for menu tabs
    private By homeTab = By.xpath("(//a[@href='/'])[3]");
    private By travelDestinationTab = By.xpath("(//a[@href='/destinations'])[2]");
    private By goBusStationsTab = By.xpath("(//a[@href='/stations'])[2]");

    // Click actions for menu tabs
    public void clickHomeTab() {
        driver.findElement(homeTab).click();
    }

    public void clickTravelDestinationTab() {
        driver.findElement(travelDestinationTab).click();
    }

    public void clickGoBusStationsTab() {
        driver.findElement(goBusStationsTab).click();
    }

    // Get the current page URL
    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }
    // Sidebar link locators
    private By s_CompanyLink = By.xpath("(//a[@href='/about'])[3]");
    private By s_PolicyLink = By.xpath("(//a[@href='/policy'])[3]");
    private By s_TermsLink = By.xpath("(//a[@href='/terms'])[3]");
    private By s_ContactUsLink = By.xpath("(//a[@href='/contact-us'])[3]");


    // Click actions
    public void clickSidebarCompany() {
        driver.findElement(s_CompanyLink).click();
    }

    public void clickSidebarPolicy() {
        driver.findElement(s_PolicyLink).click();
    }

    public void clickSidebarTerms() {
        driver.findElement(s_TermsLink).click();
    }

    public void clickSidebarContactUs() {
        driver.findElement(s_ContactUsLink).click();
    }


    }