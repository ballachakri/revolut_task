package com.revolut.sample.example.DriverManager;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;


public class DriverManager {


    public static WebDriver driver;

    public String browsers = "chrome";


    public void chooseBrowser ( ) {

        switch (browsers) {
            case "chrome":
                WebDriverManager.chromedriver ().setup ();
                driver =new ChromeDriver ();
                break;
            case "ie":
                WebDriverManager.iedriver ().setup ();
                driver=new InternetExplorerDriver ();
                break;
            case "edge":
                WebDriverManager.edgedriver ().setup ();
                driver=new EdgeDriver ();
                break;
            default:
                WebDriverManager.firefoxdriver ().setup ();
                driver=new FirefoxDriver ();
                break;
        }

    }


    public void navigateTo (String url) {
        driver.get (url);
    }

    public void maximizeBrowser ( ) {
        driver.manage ().window ().maximize ();
    }

    public void takeScreenShotIfFailed(String image) throws IOException {

        TakesScreenshot ts=(TakesScreenshot)driver;
        File scrFile=ts.getScreenshotAs (OutputType.FILE);
        FileHandler.copy (scrFile, new File ("C:\\Users\\sball\\IdeaProjects\\revolut\\src\\test\\screenShots\\"+image+".png"));


    }


    public void tearDownBrowser ( ) {
        driver.quit ();
    }

}
