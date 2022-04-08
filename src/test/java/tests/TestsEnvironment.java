package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.Common;
import utils.Driver;


public class TestsEnvironment extends Driver {

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
