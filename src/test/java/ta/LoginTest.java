package ta;

import com.auto.test.browser.BrowserTestBase;
import com.auto.utils.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_objects.DashboardPage;
import page_objects.LoginPage;

public class LoginTest extends BrowserTestBase {
    private LoginPage loginPage = new LoginPage();
    private DashboardPage dashboardPage = new DashboardPage();

    @Test(description = "Verify that user can login specific repository successfully via Dashboard login page with correct credentials")
    public void tc01() {
        Logger.step("Login with a valid user");
        loginPage.Login("administrator", "");

        Logger.verify("Verify that user is logged properly");
        Assert.assertTrue(dashboardPage.doesWelcomeLabelDisplay(), "Welcome label should be displayed after logged in");
    }

}
