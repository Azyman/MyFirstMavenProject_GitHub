package MyFirstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salarySurvey {
    @Test
    public void salaryResponse() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://forms.office.com/Pages/ResponsePage.aspx?id=QN8xPRV89UOMyOPd5aJ-FeVI7vqHVw5Ar8ssKnFguuFURDJUVDZNTUpGWFdaNFo4NVFBUDM3WFYxTi4u";
        driver.get(baseURL);
        driver.findElement(By.name("rb101c1fc80fc47c7b7109253779c01f5")).click();
        driver.findElement(By.cssSelector("#form-container > div > div > div.office-form-content.office-form-page-padding > div > div.office-form.office-form-theme-shadow > div.office-form-body > div.office-form-navigation-container > div.office-form-button-container > button")).click();
        driver.findElement(By.cssSelector("#form-container > div > div > div.office-form-content.office-form-page-padding > div > div.office-form.office-form-theme-shadow > div.office-form-body > div.office-form-question-body > div:nth-child(2) > div > div.office-form-question-element > div > div > input")).sendKeys("azory.kavhuru@econet.co.zw");
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div/label/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[4]/div/div[3]/div/div/input")).sendKeys("Azory");
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[5]/div/div[3]/div/div/input")).sendKeys("Kavhuru");
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[6]/div/div[3]/div/div/input")).sendKeys("42-208068J34");
        driver.findElement(By.cssSelector("#form-container > div > div > div.office-form-content.office-form-page-padding > div > div.office-form.office-form-theme-shadow > div.office-form-body > div.office-form-question-body > div:nth-child(7) > div > div.office-form-question-element > div > div > input")).sendKeys("Technology Services");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#form-container > div > div > div.office-form-content.office-form-page-padding > div > div.office-form.office-form-theme-shadow > div.office-form-body > div.office-form-navigation-container > div.office-form-button-container > button.office-form-theme-primary-background.office-form-theme-button.office-form-bottom-button.button-control.light-background-button.section-next-button.section-button > div")).click();
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/div/div[1]/div/label/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[3]/div[1]/button[2]/div")).click();
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[2]/div/div[3]/div/div/div/label/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div[1]/div/div[1]/div[2]/div[3]/div[1]/button[2]/div")).click();
    }
}
