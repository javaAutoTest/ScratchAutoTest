package Scratch.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Family on 26.02.2022.
 */
public class LoginPage {

    public WebDriver driver;

    WebElement moveLogin;

    WebElement userName;
    WebElement password;

    WebElement btnLogin;


    public LoginPage(WebDriver d) {
        //this.locator = locator;
        driver = d;
    }
    public void moveLogIn(){
        moveLogin = driver.findElement(By.className("ignore-react-onclickoutside"));
        moveLogin.click();
    }
    public void userName(String uName){
        userName = driver.findElement(By.id("frc-username-1088"));
        userName.sendKeys(uName);
    }
    public void setPassword(String uPass) {
        password = driver.findElement(By.id("frc-password-1088"));
        password.sendKeys(uPass);
    }
    public void getBtnLogin() {

        btnLogin = driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/ul/li[8]/div/div/form/div[3]/button"));

    }
    public void btnLoginClick(){
        btnLogin.submit();
        System.out.println("btn");
    }
}
