package Scratch.RegistrationPage;


import Scratch.PublicClasses.SetCromeDriver;
import Scratch.PublicClasses.WaitElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

/**
 * Automation Test case for scratch.mit.edu.com
 * Join Scratch page - creating new account
 */
public class JoinScratchTest {


    static public void verifyJoinScratch() {
//        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

        SetCromeDriver set = new SetCromeDriver();

        String key = "webdriver.chrome.driver";
        String value = "C:\\WebDrivers\\chromedriver.exe";

        set.setCromeDriver(key,value);
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        JoinScratchPage reg = new JoinScratchPage(driver);
        WaitElement timer = new WaitElement();

        try {
            //--------------page loading---------------------------
            driver.get("https://scratch.mit.edu/");
            Thread.sleep(2000);

            //----------------moving to Join Scratch -------------
            reg.moveJoinScratch();

            //----------------1-st Form declaration---------------

            reg.getUserName();
            reg.setUserName("DemoAutomationTest6");

            reg.setPassword("123456789");
            reg.setPasswordConfirm("123456789");
            reg.btnClick();

            timer.waitStaleness(driver, 30, reg.getUserName());

            //----------------2-nd Form declaration--------------------
            reg.getCountry();
            reg.setCountry("Armenia");
            reg.btnClick();

            //timer.waitStaleness(driver, 30,reg.getCountry());


            //----------------3-th Form declaration--------------------

            reg.getBirthMonth();
            reg.setBirthMonth("5");
            reg.setBirthYear("2000");
            reg.btnClick();

            //timer.waitStaleness(driver, 30,reg.getBirthMonth());

            //----------------4-th Form declaration--------------------
            reg.getRadioBtn();
            reg.radioBtnClick();
            reg.btnClick();

            //timer.waitStaleness(driver, 30,reg.getRadioBtn());;

            //----------------5-th Form declaration--------------------

            reg.getEmail();
            reg.setEmail("marine3008@mail.ru");

            reg.btnClick();

            timer.waitStaleness(driver, 30,reg.getEmail());
            reg.btnClick();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.quit();
    }
}

