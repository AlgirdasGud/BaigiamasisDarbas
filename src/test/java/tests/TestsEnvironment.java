package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Common;
import utils.Driver;

import static utils.Driver.driver;


public class TestsEnvironment {

    @BeforeTest
    public void testTestai() {
        Driver.initialize();
        Common.openlink("http://skriejudubysa.lt/");
    }


    @AfterTest
    public void testA() {
        driver.quit();

    }


}
