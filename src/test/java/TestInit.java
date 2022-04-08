import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
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

    public void search(String googleWord, String searchUrl) {
        driver.get(searchUrl);
        driver.findElement(By.xpath("//input[@name ='q']")).sendKeys(googleWord + "\n");
    }

     public void sleep(int seconds) {
         try {
             Thread.sleep(seconds * 1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
}
