
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mvn {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\Documents\\Batch2\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();

        driver.get("https://newegg.com");

        System.out.println(driver.getTitle());
    }
@Test
    void get_title(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\Documents\\Batch2\\chromedriver.exe");

        WebDriver driver =  new ChromeDriver();

        driver.get("https://walmart.com");

        System.out.println(driver.getTitle());
    }
}
