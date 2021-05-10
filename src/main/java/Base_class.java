import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base_class {

    WebDriver driver;


    @BeforeMethod
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milad\\Documents\\Batch2\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod
    void closeBrowser() throws InterruptedException {

            Thread.sleep(10000);
            driver.quit();
        }
    }


