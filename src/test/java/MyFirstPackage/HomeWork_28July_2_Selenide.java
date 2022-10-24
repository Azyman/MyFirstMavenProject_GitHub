package MyFirstPackage;

import org.junit.Test;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class HomeWork_28July_2_Selenide {
    @Test
    public void seleniumTest() throws InterruptedException {
        open("https://www.saucedemo.com/");
        $(By.id("user-name")).setValue("standard_user");
        $(By.id("password")).setValue("secret_sauce");
        $("#login-button").click();
        sleep(50000);
    }
}
