package tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Common;
import utils.Driver;

import static utils.Driver.driver;

class Testai extends TestsEnvironment {


    @Test
    public void testSkrieju() {

        Assert.assertTrue(Driver.driver.getCurrentUrl().contains("http://skriejudubysa.lt/"));

    }


}
