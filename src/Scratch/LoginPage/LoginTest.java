package Scratch.LoginPage;
import Scratch.PublicClasses.SetCromeDriver;
import Scratch.PublicClasses.WaitElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Created by Family on 26.02.2022.
 */
public class LoginTest {
    public static void verifyLogin(){

        SetCromeDriver set = new SetCromeDriver();
        String key = "webdriver.chrome.driver";
        String value = "C:\\WebDrivers\\chromedriver.exe";
        set.setCromeDriver(key,value);
        WebDriverWait wait;

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        LoginPage logIn = new LoginPage(driver);
        WaitElement timer = new WaitElement();

        try {
            //--------------page loading---------------------------
            driver.get("https://scratch.mit.edu/");
            Thread.sleep(2000);

            //----------------moving to Login -------------
            logIn.moveLogIn();

            //----------------Login Form declaration---------------

            logIn.userName("DemoAutomationTest10");
            logIn.setPassword("123456789");

            Thread.sleep(1000);
            logIn.getBtnLogin();
            logIn.btnLoginClick();
//
        } catch (InterruptedException e) {
            e.printStackTrace();
       }

        //driver.quit();

  }
}
