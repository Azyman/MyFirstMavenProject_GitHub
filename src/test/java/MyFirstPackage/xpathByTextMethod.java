package MyFirstPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

public class xpathByTextMethod {
    @Test
    public void byText(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/index.php";
        driver.get(baseURL);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement anchorLink = driver.findElement(By.xpath("//a[text()='Car Rentals']"));
        anchorLink.click();
    }

    @Test
    public void testBoxesCheck(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/facebook.html";

        driver.get(baseURL);

        //Initializing variables
        String expectedMessage = "This is DEMO site for TESTING purpose";
        WebElement actualMessage = driver.findElement(By.xpath("//center[text()='This is DEMO site for TESTING purpose']"));
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']"));
        WebElement keepMeCheckBox = driver.findElement(By.xpath("//input[@id='persist_box']"));

        Assert.assertEquals(expectedMessage,actualMessage.getText());

        System.out.println("If the 'Keep me logged in' check box is selected or not "+keepMeCheckBox.isSelected());

        email.sendKeys("LouiseUser");
        pass.sendKeys("GilbertPass");
        loginButton.click();
    }

    @Test
    public void homeWork_11Aug() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/radio.html";

        driver.get(baseURL);

        WebElement firstCheckBox = driver.findElement(By.xpath("//input[@value='checkbox1']"));
        firstCheckBox.click();
        System.out.println("First check box status is "+firstCheckBox.isSelected());
        Thread.sleep(1000);

        firstCheckBox.click();
        System.out.println("First check box status is "+firstCheckBox.isSelected());
        Thread.sleep(1000);
    }

    @Test
    public void testRadioButton(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/reservation.php";

        driver.get(baseURL);
        WebElement businessClass = driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        WebElement economyClass = driver.findElement(By.cssSelector("input[type='radio'][value='Coach']"));
        WebElement firstClass = driver.findElement(By.cssSelector("input[type='radio'][value='First'"));

        businessClass.click();
        economyClass.click();

        boolean isEconomySet = economyClass.isSelected();
        System.out.println("Is the Economy class selected: "+isEconomySet);
        Assert.assertTrue(isEconomySet);

        if(isEconomySet){
            System.out.println("Economy is selected");
            firstClass.click();
        }
        else {
            System.out.println("Economy is not selected");
            economyClass.click();
        }

    }

    @Test
    public void radioList(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/reservation.php";

        driver.get(baseURL);

        List<WebElement> classRadioButton = driver.findElements(By.xpath("//input[@name='servClass']"));
        System.out.println("There are "+classRadioButton.size()+" in the list");

        boolean radioButtonValue = classRadioButton.get(0).isSelected();
        System.out.println("The first radio button in the list is "+radioButtonValue);

    }

    @Test
    public void homeWork1_16_Aug(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/radio.html";

        driver.get(baseURL);

        /*WebElement radioFirst = driver.findElement(By.xpath("//input[@value='Option 1']"));
        radioFirst.click();
        System.out.println("Radio 1 is selected "+radioFirst.isSelected());

        WebElement radioThird = driver.findElement(By.xpath("//input[@value='Option 3']"));
        radioThird.click();
        System.out.println("Radio 3 is selected "+radioThird.isSelected());*/

        List<WebElement> secondRadioButton = driver.findElements(By.xpath("//input[@name='webform']"));
        secondRadioButton.get(2).click();
        boolean radioValue = secondRadioButton.get(2).isSelected();
        System.out.println("The first radio button in the list is "+radioValue);
    }

    @Test

    public void dropDownList(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com/";

        driver.get(baseURL);

        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Select dropDown = new Select(driver.findElement(By.className("product_sort_container")));
        dropDown.selectByVisibleText("Name (Z to A)");
        dropDown.selectByIndex(2);
        dropDown.selectByValue("lohi");

    }

    @Test
    public void popupExample() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/delete_customer.php";
        driver.get(baseURL);

        driver.findElement(By.name("cusid")).sendKeys("7240");
        driver.findElement(By.name("submit")).click();

        Alert alert = driver.switchTo().alert();

        String alertMsg = driver.switchTo().alert().getText();
        System.out.println(alertMsg);

        Thread.sleep(1000);

        alert.dismiss();
        Thread.sleep(2000);
        /*Alert alert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert1.accept();*/
    }

    @Test
    public void tableExample(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demo.guru99.com/test/newtours/";
        driver.get(baseURL);

        WebElement price = driver.findElement(By.xpath("//table[@width='270']//tr[4]/td[2]"));
        System.out.println(price.getText());
    }

    @Test
    public void popupExampleHomework() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.selenium.dev/documentation/webdriver/browser/alerts/";
        driver.get(baseURL);

        WebElement popup = driver.findElement(By.linkText("See an example alert"));
        popup.click();
        Thread.sleep(3000);
        Alert popupAlert = driver.switchTo().alert();
        popupAlert.dismiss();

    }
        @Test
    public void tableExampleHomework(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/web-table-element.php";
        driver.get(baseURL);

        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/td"));
        System.out.println("Number of columns is "+columns.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        Integer a = rows.size()-1;
        System.out.println("Number of rows is "+a);

        List<WebElement> cells = driver.findElements(By.xpath("//table[@class='dataTable']//tr/td"));
        System.out.println("Number of rows is "+cells.size());
    }

    @Test
    public void axisExample() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com";
        driver.get(baseURL);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        String itemName = "Sauce Labs Fleece Jacket";
        WebElement addRemoveButton = driver.findElement(addToCart(itemName));
        addRemoveButton.click();
        WebElement whatIsPrice = driver.findElement(itemPrice(itemName));
        System.out.println("The price is "+whatIsPrice.getText());

    }

    public By addToCart(String itemName){
        return  By.xpath("//div[text()='"+itemName+"']/ancestor::div[@class='inventory_item_description']//button");
    }

    public By itemPrice(String itemName){
        return  By.xpath("//div[text()='"+itemName+"']/ancestor::div[@class='inventory_item_description']//div[@class='inventory_item_price']");
    }

        public By addToCart1(String productName){
        return By.xpath("//a[text()='"+productName+"']/ancestor::div[@class='product-item']//div[@class='buttons']/input");
        }

    @Test
    public void stringExample() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com";
        driver.get(baseURL);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String userNames = driver.findElement(By.id("login_credentials")).getText();
        String passWords = driver.findElement(By.className("login_password")).getText();

        String[] userNameArray = userNames.split("\n");
        String[] passWordArray = passWords.split("\n");

        driver.findElement(By.id("user-name")).sendKeys(userNameArray[2]);
        driver.findElement(By.id("password")).sendKeys(passWordArray[1]);
        driver.findElement(By.id("login-button")).click();

        String expectedMsg = "Epic sadface: Sorry, this user has been locked out.";
        String actualMsg = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
        System.out.println(actualMsg);
        Assert.assertEquals(expectedMsg,actualMsg);
     }

    @Test
    public void tryCatchExample() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.saucedemo.com";
        driver.get(baseURL);
    }

    @Test
    public void dateClass(){
        Date d = new Date();
        System.out.println(d);
        //System.out.println(d.getHours());
        SimpleDateFormat sdf = new SimpleDateFormat("MMMMM/dd/yyyy HH:MM");
        System.out.println(sdf.format(d));
        }

    @Test
    public void homeWork_25_Aug() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demowebshop.tricentis.com/";
        driver.get(baseURL);
        String productName = "14.1-inch Laptop";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addRemoveButton = driver.findElement(addToCart1(productName));
        System.out.println("Adding the first item "+productName);
        addRemoveButton.click();
        WebElement expectedMsg = driver.findElement(By.xpath("//p[@class='content']"));
        String expectedMsgString = expectedMsg.getText();
        String actualMsg = "The product has been added to your shopping cart";
        System.out.println("Expected msg is "+expectedMsg.getText());
        Assert.assertEquals(expectedMsgString,actualMsg);
    }

    @Test
    public void forLoop(){
        for(int i = 1;i<6;i++){
            System.out.println("Yes");
        }
    }

    @Test
    public void arrayExample(){
        String arr[] = {"Peach","Grape","Orange","Mango","Banana","Guava"};
        for(int i = 0;i<=2;i++){
            if(i==0)
                System.out.println(arr[i]);
            else if (i==2)
                System.out.println(arr[i]);
        }

        System.out.println("Number of elements is "+arr.length);
    }

    @Test
    public void dateExample() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://demos.telerik.com/kendo-ui/datetimepicker/index";
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String dateTime = "10/5/2020 5:52 PM";
        String date_MM_dd_yyyy[] = (dateTime.split(" "))[0].split(":");
        String time = dateTime.split(" ")[1];
        String amPM = dateTime.split(" ")[2];

        WebElement selectDate = driver.findElement(By.xpath("//button[@aria-label='Open the date view']"));
        selectDate.click();


        WebElement midButn = driver.findElement(By.xpath("//a[@title='Navigate to year view']"));
        midButn.click();

        WebElement previousBtn = driver.findElement(By.xpath("//a[@aria-label='Previous']"));
        previousBtn.click();
        Thread.sleep(1000);
        WebElement nextBtn = driver.findElement(By.xpath("//a[@aria-label='Next']"));
        nextBtn.click();
        Thread.sleep(1000);
        nextBtn.click();

        List<WebElement> pickAllMonths = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[contains(@class,'k-calendar')]"));
        pickAllMonths.get(Integer.parseInt(date_MM_dd_yyyy[1])-1).click();
        Thread.sleep(1000);
        List<WebElement> listAllDays = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//tbody//td[not(contains(@class,'k-other-month'))]"));
        listAllDays.get(Integer.parseInt(date_MM_dd_yyyy[0])-1).click();
        Thread.sleep(1000);

        List<WebElement> listTimes = driver.findElements(By.xpath("//button[@aria-label='Open the time view']"));

        for(WebElement webElement : listTimes){
            if(webElement.getText().equalsIgnoreCase(time)){
                System.out.println(webElement.getText());
                webElement.click();
            }
        }


        /*WebElement pickMonth = driver.findElement(By.xpath("//a[@aria-label='July']"));
        pickMonth.click();
        WebElement pickDay = driver.findElement(By.xpath("//a[@title='Monday, July 17, 2023']"));
        pickDay.click();
        WebElement fullDate = driver.findElement(By.id("datetimepicker"));

        String date = fullDate.getText().format(String.valueOf(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a")));

        System.out.println("Full date is "+fullDate.getText());//nothing is printing here

        String splitDate[] = (date.split(" ")[0].split("/"));
        System.out.println("This is the Month "+splitDate[0]);
        System.out.println("This is the day "+splitDate[1]);
        System.out.println("This is the year "+splitDate[2]);*/
    }

    @Test
    public void anotherDateExample(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://demo.guru99.com/test/";
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement fullDate = driver.findElement(By.name("bdaytime"));
        //Fill date as mm/dd/yyyy as 09/25/2013

        fullDate.sendKeys("17072013");
        fullDate.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM

        fullDate.sendKeys("1445");

    }

}



