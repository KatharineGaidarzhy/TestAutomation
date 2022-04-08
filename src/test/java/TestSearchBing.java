import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearchBing extends TestInit {
    String searchEngine = "https://www.bing.com";


    @Test
    public void googleSomeWord() {
        String searchWord = "dogs";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public void googleCats() {
        String searchWord = "dogs";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public void googleStraus() {
        String searchWord = "horse";
        search(searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
        public void googleHorse(){
        String searchWord = "cats";
        search (searchWord, searchEngine);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




