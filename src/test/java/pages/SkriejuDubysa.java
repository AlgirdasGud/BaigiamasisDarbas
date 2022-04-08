package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class SkriejuDubysa {

    String locator = "";

    static WebElement resultField= Driver.driver.findElement(By.xpath("//*[@id=\"marsrutai\"]/div/div/div/div/div[1]/h1"));
    static WebElement button = Driver.driver.findElement(By.xpath("//*[@id=\"menu-item-420\"]/a/span[2]"));
    static WebElement input = Driver.driver.findElement(By.xpath(""));


    public static void pushButton() {
        button.click();
    }
    public static void getFieldText() {



    }
      ;










}
