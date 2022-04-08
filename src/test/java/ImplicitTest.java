import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitTest extends TestInit {

    @Test
    public void searchBoston() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eatstreet.com/");
        driver.findElement(By.xpath("//input[@id = 'input-food-search']")).sendKeys("Boston, MA\n");
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//a[@id ='find-restaurants']")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h1"), "Boston"));

        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Boston"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id= 'filters-checkbox-delivery']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-cuisine-American Food']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-cuisine-Asian Food']/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='filter-cuisine-Bakery Food']/..")).isDisplayed());






    }


}
