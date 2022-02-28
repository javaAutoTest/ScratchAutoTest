package Scratch.SignOut;

import Scratch.LoginPage.LoginTest;
import Scratch.PublicClasses.SetCromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Created by Family on 26.02.2022.
 */
public class SignOutTest extends LoginTest {


    public static void verifySignOut() {

        SetCromeDriver set = new SetCromeDriver();
        String key = "webdriver.chrome.driver";
        String value = "C:\\WebDrivers\\chromedriver.exe";
        set.setCromeDriver(key, value);

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        SignOutPage signOut = new SignOutPage(driver);


        try {
            //--------------page loading---------------------------
            driver.get("https://scratch.mit.edu/#");
            Thread.sleep(2000);

            //----------------moving to Login -------------
            signOut.userAccount();
            signOut.signOutClick();


            Thread.sleep(1000);

//
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.quit();
    }
}
