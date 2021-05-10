import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TestNG extends Base_class{


    @Test
    void Amazon_get_title(){

        driver.get("https://amazon.com");
        System.out.println(driver.getTitle());
    }

    @Test
    void Print_categories(){

        driver.get("https://amazon.com");
        WebElement categories=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        System.out.println(categories.getText());

    }

@Test
    void select_categories(){

        driver.get("https://amazon.com");
    WebElement categories=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(categories);
        select.selectByIndex(4);
    }

}


