import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchYahoo extends TestInit {
    String searchEngine = "https://es.search.yahoo.com/";

    @Test
    public void googleSomeWord() {
        String searchWord = "dogs";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public void googleCats() {
        String searchWord = "dogs";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public void googleStraus() {
        String searchWord = "horse";
        search(searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    @Test
    public void googleHorse(){
        String searchWord = "cats";
        search (searchWord);
        Assert.assertTrue(driver.getCurrentUrl().contains(searchWord));
    }
    public void search(String googleWord){
        driver.get(searchEngine);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//input[@name='p']")).sendKeys(googleWord + "\n");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
