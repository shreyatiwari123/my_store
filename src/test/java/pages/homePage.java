package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utility.Utility;

import java.util.Properties;

public class homePage {
    WebDriver driver;
    WebDriverWait wait;
    Properties prop;
    Utility utils;
    JavascriptExecutor js;

    public homePage() {
        utils = new Utility();
        prop = utils.init_prop();
        driver = utils.init_driver(prop); /// this line is use to open browser and visit the url and return the driver type.
        wait = new WebDriverWait(driver, Integer.parseInt(prop.getProperty("WebDriverWaitTimeout")));
        js = (JavascriptExecutor) driver;
    }

    public void launchTheApplicationUrl() {
        System.out.println("browser is invoked and redirected to the website URL");
    }

    public void verifyUserIsLandOnApplicationUrl() {
        Assert.assertEquals("http://automationpractice.com/index.php",driver.getCurrentUrl());
    }

    public void tearDown() {
        driver.quit();
    }

    public void searchForInSearchBar(String sText) throws InterruptedException {
        WebElement searchBox = driver.findElement(By.xpath("//*[@id='search_query_top']"));
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(sText);
        driver.findElement(By.xpath("//*[@name='submit_search']")).click();
        Thread.sleep(5000);
    }
}
