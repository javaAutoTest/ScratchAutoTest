package Scratch.RegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 * Automation Test case for scratch.mit.edu.com
 * Join Scratch page - creating new account
 */
public class JoinScratchPage {

    public WebDriver driver;

    WebElement moveJoinScratch;
    WebElement setUserName;
    WebElement setPassword;
    WebElement setPasswordConfirm;

    WebElement countryW;
    Select country;

    WebElement birthMonthW;
    Select birthMonth;
    Select birthYear;

    WebElement radioBtn;

    WebElement setEmail;

    WebElement btnClick;


    public JoinScratchPage(WebDriver d) {
        //this.locator = locator;
        driver = d;
    }

    public void moveJoinScratch() {
        moveJoinScratch = driver.findElement(By.className("registrationLink"));
        moveJoinScratch.click();
    }

    public WebElement getUserName() {
        return setUserName = driver.findElement(By.name("username"));
    }

    public void setUserName(String uName) {

        setUserName.sendKeys(uName);
    }

    public void setPassword(String uPass) {
        setPassword = driver.findElement(By.name("password"));
        setPassword.sendKeys(uPass);
    }

    public void setPasswordConfirm(String uPassConf) {
        setPasswordConfirm = driver.findElement(By.name("passwordConfirm"));
        setPasswordConfirm.sendKeys(uPassConf);
    }

    public WebElement getCountry() {
        return countryW = driver.findElement(By.name("country"));
    }

    public void setCountry(String option) {
        country = new Select(countryW);
        country.selectByVisibleText(option);
    }

    public WebElement getBirthMonth() {
        return birthMonthW = driver.findElement(By.id("birth_month"));
    }

    public void setBirthMonth(String option) {
        birthMonth = new Select(birthMonthW);
        birthMonth.selectByValue(option);
    }

    public void setBirthYear(String option) {
        birthYear = new Select(driver.findElement(By.name("birth_year")));
        birthYear.selectByVisibleText(option);
    }

    public WebElement getRadioBtn() {

        return radioBtn = driver.findElement(By.id("GenderRadioOptionMale"));
    }

    public WebElement setRadioBtn() {

        return radioBtn = driver.findElement(By.id("GenderRadioOptionMale"));
    }

    public WebElement getEmail() {

        return setEmail = driver.findElement(By.name("email"));
    }

    public void setEmail(String email) {

        setEmail.sendKeys(email);
    }

    public void radioBtnClick() {

        radioBtn.click();
    }

    public void btnClick() {
        btnClick = driver.findElement(By.className("modal-flush-bottom-button"));
        btnClick.submit();
    }


}
