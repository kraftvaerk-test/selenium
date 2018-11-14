package rutest;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.MainPage;
import java.util.concurrent.TimeUnit;

public class Kraftvaerk {

    private static WebDriver driver;
    private static String searchValue;
    private static int searchPosition;

    @Before
    public void setup() {
        searchValue = "www.yandex.ru";
        searchPosition = 1;
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }
    @Test
    public void testSearch() {
        MainPage mainPage = new MainPage(driver);
        mainPage
                .startSearch(searchValue, searchPosition);
    }

    @After
    public void testEnd() {
        driver.close();
    }
}

