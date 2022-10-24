package MyFirstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AnotherClass {
    public static void main(String[] args) throws InterruptedException {
        BasicConfigurator.configure();
        System.out.println("Hello World!");
        //Webdriver setup
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Configure driver waits
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Set parameters
        String baseURL = "https://www.saucedemo.com";
        driver.get(baseURL);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Swag Labs";

        System.out.println("Near if statement");
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        System.out.println("Get tittle is "+driver.getTitle()+" and expected title is "+ expectedTitle);
    }

}
