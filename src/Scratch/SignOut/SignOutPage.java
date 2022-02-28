package Scratch.SignOut;

import Scratch.LoginPage.LoginTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Family on 26.02.2022.
 */
public class SignOutPage {
    public WebDriver driver;

    WebElement userAccount;
    WebElement signOutClick;


    public SignOutPage(WebDriver d) {
        //this.locator = locator;
        driver = d;
    }

    public void userAccount(){
        userAccount = driver.findElement(By.className("ignore-react-onclickoutside user-info open"));
        userAccount.click();
    }
    public void signOutClick(){
        signOutClick = driver.findElement(By.className("divider"));
        signOutClick.submit();

    }
}
