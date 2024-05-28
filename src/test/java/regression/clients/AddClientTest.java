package regression.clients;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;

public class AddClientTest {
    WebDriver driver;
    @BeforeClass
    public void doLogin()
    {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        Login login = new Login(driver);

        login.setTxtUsername("amolujagare@gmail.com");
        login.setTxtPassword("admin123");
        login.clickLogin();
    }

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);
        addClient.setClientName("John");
        addClient.setClientSurname("Doe");
        addClient.setStreetAddress1("123 Main St");
        addClient.setStreetAddress2("Apt 4B");
        addClient.setCity("Anytown");
        addClient.setState("Anystate");
        addClient.setZipCode("12345");
        addClient.setPhoneNumber("123-456-7890");
        addClient.setFaxNumber("123-456-7891");
        addClient.setMobileNumber("123-456-7892");
        addClient.setEmailAddress("john.doe@example.com");
        addClient.setWebAddress("www.johndoe.com");
        addClient.setVATID("VAT123456");
        addClient.setTaxesCode("TAX123456");

        // Click the save button
        addClient.clickSave();
    }
}
