package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Menu;
import pages.clients.AddClient;
import util.DoLogin;

import static util.UITestUtils.UITestMethods.selectionCheck;

public class AddClientTest extends DoLogin {
    AddClient addClient;
    @BeforeClass
    public void initAddClient()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();
        addClient = new AddClient(driver);

    }

    @Test
    public void activeCheckBoxCheck()
    {
        boolean expected = true;
        boolean actual = selectionCheck(addClient.active);
        Assert.assertEquals(actual,expected,"element is not selecteed");
    }
}
