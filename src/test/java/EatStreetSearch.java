import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class EatStreetSearch extends TestInit{

    @Test
    public void searchMadison(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//input[@id = 'input-food-search']")).sendKeys("Madison, WI\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id = 'find-restaurants']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"), "Madison"));


        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id= 'filters-checkbox-delivery']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id= 'filters-checkbox-takeout']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Free Delivery']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Rating 4+']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Order Ahead']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-Specials']/..")).isDisplayed());
    }
}
