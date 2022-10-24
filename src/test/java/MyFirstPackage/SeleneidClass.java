package MyFirstPackage;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SeleneidClass {
    @Test
    public void googleSearch() throws InterruptedException {
        open("https://www.google.co.zw");
        $(By.name("q")).setValue("Selenide").pressEnter();
        ElementsCollection selenideElements = $$("#ires li.g").shouldHave(CollectionCondition.size(4));
        $$("ires li.g").shouldHave(CollectionCondition.texts("Selenide UI tests"));
        Thread.sleep(1000);
    }
}
