import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    @Test
    public void TestSignIn() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eatstreet.com/");
        Assert.assertTrue(driver.getTitle().contains("EatStreet"));
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gaydarzhi1234@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("eatstreet19");
        driver.findElement(By.xpath("//button[@type='submit'] ")).click();
    }

    @Test
    public void TestSignin2 (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eatstreet.com/");
        Assert.assertTrue(driver.getTitle().contains("EatStreet"));
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'btn-google--sign-in')]")).click();
    }
    @Test
    public void TestSignUp (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://eatstreet.com/");
        Assert.assertTrue(driver.getTitle().contains("EatStreet"));
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'btn-facebook__sign-in')]")).click();
    }
}
