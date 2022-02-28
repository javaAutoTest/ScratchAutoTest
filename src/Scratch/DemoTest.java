package Scratch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Created by Family on 23.02.2022.
 */
public class DemoTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


        try {
            driver.get("https://scratch.mit.edu/");
            Thread.sleep(2000);

            driver.findElement(By.className("registrationLink")).click();

            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("DemoAutomationTest5");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("12345wewe");

            WebElement passwprdConfirm = driver.findElement
                    (By.name("passwordConfirm"));
            passwprdConfirm.sendKeys("12345wewe");



            WebElement btnSubmit = driver.findElement
                    (By.className("modal-flush-bottom-button"));
            btnSubmit.submit();

            wait.until(ExpectedConditions.stalenessOf(username));

            //-------------------------------------------------------
            WebElement countryW = driver.findElement(By.name("country"));
            Select country = new Select(countryW);
            country.selectByVisibleText("Armenia");
            System.out.println("0");

            driver.findElement(By.className("modal-flush-bottom-button")).submit();
            System.out.println("1");

            wait.until(ExpectedConditions.stalenessOf(countryW));



            //////////////////////////////////////////////////////////////////////
            WebElement birthMonthW = driver.findElement
                    (By.id("birth_month"));

            Select birthMonth = new Select(driver.findElement
                    (By.id("birth_month")));
            System.out.println("3");
            birthMonth.selectByValue("5");

            Select birthYear = new Select(driver.findElement
                    (By.name("birth_year")));
            birthYear.selectByVisibleText("2000");

            driver.findElement(By.className("modal-flush-bottom-button")).submit();

            wait.until(ExpectedConditions.stalenessOf(birthMonthW));

            //-----------------------------------------------------------------
            WebElement radioBtn = driver.findElement(By.id("GenderRadioOptionMale"));
            radioBtn.click();
            driver.findElement(By.className("modal-flush-bottom-button")).submit();
            wait.until(ExpectedConditions.stalenessOf(radioBtn));

            //-------------------------------

            WebElement email = driver.findElement(By.name("email"));
            email.sendKeys("marine3008@yahoo.com");
            driver.findElement(By.className("modal-flush-bottom-button")).submit();

            wait.until(ExpectedConditions.stalenessOf(email));

            driver.findElement(By.className("modal-flush-bottom-button")).submit();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
