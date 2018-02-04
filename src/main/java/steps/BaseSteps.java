package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;

    @Before
    public static void startTest(){
        System.setProperty("webdriver.chrome.driver", "drv/chromedriver.exe");
        driver = new ChromeDriver();
        driver .get("https://yandex.ru/");
        driver .manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver .manage().window().maximize();
        driver .manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @After
    public static void tearDown() throws Exception {
        driver.quit();
    }

}
