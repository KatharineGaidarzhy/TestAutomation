import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogleIT  extends TestInit {
    String searchEngine = "https://www.google.com/ua";

    @Test
    public void googleSomeWord() {
       String searchWord = "dogs";
       search(searchWord, searchEngine);
       Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }

    @Test
    public void googleCats() {
        String searchWord = "cats";
        search(searchWord, searchEngine);

        Assert.assertTrue(driver.getCurrentUrl().contains("cats"));
    }

    @Test
    public void googleFox(){
        String  searchWord = "fox";
        search(searchWord, searchEngine);
    }

    public void search(String googleWord){
        driver.get(searchEngine);
        driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys(googleWord + "\n");
    }
}


