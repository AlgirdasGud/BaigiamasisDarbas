package pages;


import org.openqa.selenium.By;
import utils.Driver;

public class Common {

    public static void openlink(String url) {

        Driver.driver.get(url);
    }

    public static void findElement(By locator){

        Driver.driver.findElement(locator);

    }










}


