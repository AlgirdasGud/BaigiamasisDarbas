package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SkriejuDubysa;
import utils.Driver;

class Testai extends TestsEnvironment {


    @Test
    public void testSkrieju() {
        //SkriejuDubysa.kazkoksMetodas();
        Assert.assertTrue(Driver.driver.getCurrentUrl().contains("http://skriejudubysa.lt/"));
    }



}


