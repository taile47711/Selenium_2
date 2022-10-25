package com.auto.test.ta;

import com.auto.driver.DriverUntils;
import com.auto.test.browser.BrowserTestBase;
import com.auto.utils.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.LoginPage;

public class DA_LOGIN_TC002 extends BrowserTestBase {

    private LoginPage loginPage = new LoginPage();

    @Test(description = "Verify that user fails to login specific repository successfully via Dashboard login page with incorrect credentials")
    public void tc02_VerifyCantLoginWithIncorrectCredentials() {
        Logger.step("Login with a invalid user");
        loginPage.Login("abc", "abc");

        Logger.verify("Verify that error message appears");
        Assert.assertEquals(DriverUntils.getAlertMessage(), "Username or password is invalid", "Message incorrectly");
    }
}
