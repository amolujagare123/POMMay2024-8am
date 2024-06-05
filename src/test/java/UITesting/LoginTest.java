package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenUrl;

import static util.UITestUtils.UITestMethods.*;

public class LoginTest extends OpenUrl {
    Login login;
    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }

    @Test
    public void txtUsernameVisibilityTest()
    {
        boolean expected = true;
        boolean actual = false;
        try {
             actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e)
        {

        }
        Assert.assertEquals(actual,expected,"element is not displayed");
    }

    @Test
    public void txtPasswordVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = visibilityCheck(login.txtPassword);
        Assert.assertEquals(actual,expected,"element is not displayed");
    }

    @Test
    public void txtPasswordEnabilityCheck()
    {
        boolean expected = true;
        boolean actual = enabilityCheck(login.txtPassword);
        Assert.assertEquals(actual,expected,"element is not enabled");
    }


    @Test
    public void lblEmailSpellCheck()
    {
        String expected = "Email";
        String actual = spellCheck(login.lblEmail);
        Assert.assertEquals(actual,expected,"incorrect");
    }

    @Test
    public void txtUsernameWatermarkCheck() {
        String expected = "Email";
        String actual = placeholderCheck(login.txtUsername,"placeholder");
        Assert.assertEquals(actual, expected, "incorrect");
    }
  /*  @Test
    public void lblEmailFontSizeCheck()
    {
        String expected = "Email";
        String actual = spellCheck(login.lblEmail);
        Assert.assertEquals(actual,expected,"incorrect");
    }*/
}
