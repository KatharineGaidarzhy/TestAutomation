import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchEatStreet {
    WebDriver driver;

    @BeforeMethod
    public void beforeMyTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void afterMyTest() {
        driver.quit();
    }


    @Test
    public void SearchMadison() {
        SearchCity("Madison");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Madison"));
    }

    @Test
    public void SearchNewYork() {
       SearchCity("New York");
       try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("New York"));
    }

    @Test
    public void SearchBoston() {
        SearchCity("Boston");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Boston"));
    }

    @Test
    public void SearchDetroit() {
        SearchCity("Detroit");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).getText().contains("Detroit"));
    }

       public void SearchCity(String foodSearch){
           driver.get("https://eatstreet.com/");
           driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys(foodSearch + "\n");
           driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
           driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
    }
}
