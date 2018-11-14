package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SearchResults extends PageObject{

    @FindBy(className = "iUh30")
    private List<WebElement> searchLinks;

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    public SearchResults findLinks(String searchValue, int searchPosition) {
        int i = 1;
        for(WebElement we : searchLinks) {
            System.out.println("Link text[" + i + "]: " + we.getText());
            if (i == searchPosition) {
                try {
                    Assert.assertTrue(we.getText().contains(searchValue));
                    System.out.println("Test passed - Link at position " + searchPosition + " leads to " + searchValue);
                } catch (AssertionError e) {
                    System.out.println("Test failed - Link at position " + searchPosition + " does not lead to " + searchValue);
                    throw e;
                }
            }
            i++;
        }
        return this;
    }
}

