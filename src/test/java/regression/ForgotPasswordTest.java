package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.Login;
import util.OpenUrl;

import java.io.IOException;


import static util.ConfigReader.getUrl;

public class ForgotPasswordTest extends OpenUrl {

    @Test
    public void forgotPasswordTest() throws IOException {


        Login login = new Login(driver);
        login.clickForgotPassword();

        ForgotPassword forgotPassword = new ForgotPassword(driver);
        forgotPassword.setTxtEmail("amol@gmail.com");
        forgotPassword.clickReset();
    }
}
