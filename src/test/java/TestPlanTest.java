import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class TestPlanTest {
    WebDriver driver;
    By testManagementPageLink = By.cssSelector("#test_plan_mgmt_topics>a");
    //org.openqa.selenium.NoSuchElementException: Unable to locate element: {"method":"css selector","selector":"#test_plan_mgmt_topics>a"
    By testManagementPageLink1 = By.xpath(".//*[@id='test_plan_mgmt_topics']/a[1]");
    //org.openqa.selenium.NoSuchElementException: Unable to locate element: {"method":"xpath","selector":".//*[@id='test_plan_mgmt_topics"
    @BeforeTest
        public void login(){
            driver = new FirefoxDriver();

            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            loginPage.login(new User());
        }

    @Test
    public void Mytest() {
    //    driver.findElement(testManagementPageLink1).click();
    System.out.println("1111111");

    }


/*
    @Test
    public void createTestPlanTest(){
        HomePage homePage = new HomePage(driver);

        TestPlanManagementPage testPlanManagementPage = homePage.openTestPlanManagement();
        TestPlanEditPage editPage = testPlanManagementPage.createTestPlan();

        TestPlan testPlan = new TestPlan();
        editPage.createTestPlan(testPlan);

        Assert.assertTrue(testPlanManagementPage.isTestPlanPresent(testPlan));
        deleteTestPlan(testPlan);
    }
**/

    @AfterTest
    public void logout(){
        HomePage homePage = new HomePage(driver);
        homePage.logout();
        if (driver != null)
            driver.quit();
    }


}

/*    public void deleteTestPlan(TestPlan testPlan){
        TestPlanManagementPage managementPage = new TestPlanManagementPage(driver);
        managementPage.deleteTestPlan(testPlan);
    }

    public void logout(){
        HomePage homePage = new HomePage(driver);
        homePage.logout();
    }
}

*/