package MyFirstPackage;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Assertions {

        @Test
        public void firstJUnitTest() throws InterruptedException {
        BasicConfigurator.configure();
        System.out.println("Hello World!");
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/Volumes/Data/Academics/Softwares/chromedriver");
        WebDriver driver = new ChromeDriver();
        String actualTitle = "";
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String baseURL = "https://www.saucedemo.com";
        String expectedTitle = "Swag Labs";
        Thread.sleep(1000);
        actualTitle = driver.getTitle();
        driver.get(baseURL);
        assertEquals(expectedTitle,actualTitle);
        System.out.println("Get tittle is "+driver.getTitle());

    }
}
