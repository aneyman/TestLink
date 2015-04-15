package pages;


import org.openqa.selenium.WebDriver;

public class AbstractPage {
  //  Logger logger = LoggerFactory.getLogger(AbstractPage.class);

    protected WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver getWebDriver() {
        return driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }

        public AbstractPage ensurePageLoaded() {
        return this;
    }


}
