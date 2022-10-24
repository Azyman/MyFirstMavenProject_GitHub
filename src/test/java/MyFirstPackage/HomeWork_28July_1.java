package MyFirstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomeWork_28July_1 {
    @Test
    public void firstTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        Thread.sleep(1000);
        loginButton.click();
    }

    @Test
    public void linkText() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Configure waits
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        String baseURL = "https://demo.guru99.com/test/newtours/";
        driver.get(baseURL);
        driver.findElement(By.partialLinkText("entals")).click();
        //driver.findElement(By.linkText("Car Rentals")).click();
        Thread.sleep(1000);
    }

    @Test
    public void homeWork02Aug_1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/";
        driver.get(baseURL);
        driver.findElement(By.linkText("SIGN-ON")).click();
    }

    @Test
    public void homeWork02Aug_2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/";
        driver.get(baseURL);
        driver.findElement(By.partialLinkText("N-ON")).click();
    }

    @Test
    public void homeWork02Aug_3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com";
        driver.get(baseURL);
        WebElement byClass = driver.findElement(By.className("login_credentials"));
        String textOnDiv = byClass.getText();
        System.out.println("This is text from DIV "+textOnDiv);
    }

    @Test
    public void homeWork02Aug_4(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/index.php";
        driver.get(baseURL);
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("Number of links on the page is "+links.size());
    }

    @Test
    public void selectingTagName() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com/";
        driver.get(baseURL);
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[type='password'][name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[id='login-button'][name='login-button']")).click();

        driver.findElement(By.cssSelector("a[id='item_0_title_link']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[name^='back-to']")).click();//Starts with
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[id*='em_2_title_li'")).click();//Contains
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[name$='bs-onesie'")).click();//Ends with
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("a[class='shopping_cart_link'")).click();

    }

    @Test
    public void XpathClass(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com/";
        driver.findElement(By.xpath("//*[@id=\"user-name\"]"));

    }
}
