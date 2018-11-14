package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{

    @FindBy(id = "lst-ib")
    private WebElement searchForm;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public SearchResults startSearch(String searchValue, int searchPosition) {
        searchForm.click();
        searchForm.sendKeys(searchValue);
        searchForm.sendKeys(Keys.ENTER);
        return new SearchResults(driver)
                .findLinks(searchValue, searchPosition);
    }
}

