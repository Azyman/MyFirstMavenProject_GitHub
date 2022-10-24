package MyFirstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class FirstJUnitTest {

    @Test
    public void firstJUnitTest(){
        System.out.println("First JUnit Test");
    }

    @Test
    public void secondJUnitTest(){
        System.out.println("Second JUnit Test");
    }

    @Test
    public void thirdJUnitTest(){
        System.out.println("Third JUnit Test");
    }

    @Test
    public void demoQA(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Azory");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Kavhuru");
    }

    @Test
    public  void completeForm() throws InterruptedException, AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
        driver.findElement(By.id("userEmail")).sendKeys("azorykavhuru@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        WebElement userNumber = driver.findElement(By.id("userNumber"));
        userNumber.sendKeys("0774222547");
        WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
        //String s = Keys.chord(Keys.CONTROL, "a");
        //dateOfBirthInput.sendKeys(s);
        //dateOfBirthInput.sendKeys(Keys.DELETE);
        //dateOfBirthInput.sendKeys("09 Oct 1984");
        //driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Fashion");
        WebElement hobbies1 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
        hobbies1.click();
        WebElement hobbies2 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
        hobbies2.click();
        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        File picToUpload = new File("/Users/akavhuru/Pictures/Signature.png");
        StringSelection stringSelection = new StringSelection(picToUpload.getAbsolutePath());
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);
//Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
//Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
//Press Enter key to close the Goto window and Upload window

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }

    @Test
    public void radioButton() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/radiobutton");

        driver.findElement(By.cssSelector("input[value='option2']")).click();

        Thread.sleep(1000);
    }
}
