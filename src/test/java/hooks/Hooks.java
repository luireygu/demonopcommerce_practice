package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverController;

public class Hooks {

    @Before
    public void setUp() {
        DriverController.initDriver();
    }

    //@After
    public void tearDown() {
        DriverController.quitDriver();
    }
}
