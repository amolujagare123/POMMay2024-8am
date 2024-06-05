package util.UITestUtils;

import org.openqa.selenium.WebElement;

public class UITestMethods {

    public static boolean visibilityCheck(WebElement element)
    {
        boolean result = false;
        try {
            result   = element.isDisplayed();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static boolean enabilityCheck(WebElement element)
    {
        boolean result = false;
        try {
            result   = element.isEnabled();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static boolean selectionCheck(WebElement element)
    {
        boolean result = false;
        try {
            result   = element.isSelected();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String spellCheck(WebElement element)
    {
        String result = "";
        try {
            result   = element.getText();
        }
        catch (Exception e)
        {

        }
        return result;
    }

    public static String placeholderCheck(WebElement element,String attributeName)
    {
        String result = "";
        try {
            result   = element.getAttribute(attributeName);
        }
        catch (Exception e)
        {

        }
        return result;
    }




}
