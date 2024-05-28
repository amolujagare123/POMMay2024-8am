package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

   /* WebDriver driver;
    WebElement element = driver.findElement(By.id(""));*/

    @FindBy (id="email")
    WebElement txtUsername;
    @FindBy (id="password")
    WebElement txtPassword;
    @FindBy (xpath = "//button[@type='submit']")
    WebElement btnLogin;

    @FindBy(xpath = "//a[normalize-space()='I forgot my password']")
    WebElement lnkForgotPassword;

    public void clickForgotPassword()
    {
        lnkForgotPassword.click();
    }

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void setTxtUsername(String username)
    {
        txtUsername.sendKeys(username);
    }
    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void clickLogin()
    {
        btnLogin.click();
    }

}
