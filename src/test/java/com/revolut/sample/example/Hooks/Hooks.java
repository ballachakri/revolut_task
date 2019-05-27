package com.revolut.sample.example.Hooks;

import com.revolut.sample.example.DriverManager.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class Hooks {

    private DriverManager driverManager = new DriverManager ();

    private String url="https://www.revolut.com/";

    @Before
    public void setupBrowser ( ) {
        driverManager.chooseBrowser ();
        driverManager.navigateTo (url);
        driverManager.maximizeBrowser ();

    }


    @After
    public void teatDownBrowser (Scenario scene) throws IOException {
        if(scene.isFailed ())
        {
            String scenarioName=scene.getName ();
            driverManager.takeScreenShotIfFailed (scenarioName);

        }
        driverManager.tearDownBrowser ();
    }
}
