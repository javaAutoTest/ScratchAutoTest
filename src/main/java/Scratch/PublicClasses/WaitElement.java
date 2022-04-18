package Scratch.PublicClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * /**
 * Automation Test case for scratch.mit.edu.com
 * Join Scratch page - creating new account
 */


public class WaitElement {

    WebDriverWait waits;

    public void waitStaleness(WebDriver driver, int seconds, WebElement element) {
        waits = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        waits.until(ExpectedConditions.stalenessOf(element));
    }
}
