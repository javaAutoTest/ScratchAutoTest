package Scratch.SignOut;

import Scratch.LoginPage.LoginTest;

/**
 * At first load Registration and Login Test cases
 * you must have an account and be loged in
 */
public class SignOutMain {
    public static void main(String[] args) {
        LoginTest log = new LoginTest();
        log.verifyLogin();
        SignOutTest.verifySignOut();
    }
}
