import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstAutomationScript {
    public static void main(String[] args )
    {
        BasicConfigurator.configure();
        System.out.println( "Hello World!" );
        //System.setProperty("webdriver.chrome.driver", "/Volumes/Data/Academics/Softwares/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Configure waits
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String baseURL = ("https://demo.guru99.com/test/newtours/");
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "Welcome: Mercury Tous";

        //Navigate

        driver.get(baseURL);

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else System.out.println("Fail");
        System.out.println(driver.getTitle());

    }
}
