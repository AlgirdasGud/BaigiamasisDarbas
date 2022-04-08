package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    public static WebDriver driver;

    public static void initialize() {
        WebDriverManager.chromedriver().driverVersion("100.0.4896.75").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        driver = new ChromeDriver(options);
        String locator = "";
    }
    //    driver = new ChromeDriver();


    public static void quit() {

        driver.quit();
    }

}












