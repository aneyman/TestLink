package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomePage extends AbstractPage{

    private static final By version = By.xpath("//div[@class='menu_title']/span[contains(text(),'TestLink')]");
    private static final By logout = By.cssSelector("html/body/div[2]/span[2]/a[2]/img");





    public HomePage(WebDriver driver) {
        super(driver);
    }


    public boolean isOpened(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(version));

        return !driver.findElements(version).isEmpty();
    }




    public void logout(){

        WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("img[title=Logout]")));
        driver.findElement(logout).click();
    }
}