package com.revolut.sample.example.HeaderPage;

import com.revolut.sample.example.DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HeaderPage extends DriverManager {


    public void goToCommunityPage ( ) {

        WebElement helpMenu = driver.findElement (By.xpath ("//*[@id=\"___gatsby\"]/div/div[2]/div/div/div[2]/div[2]/div[4]/div[1]/span"));
        Actions act = new Actions (driver);
        act.moveToElement (helpMenu).build ().perform ();
        WebElement community = driver.findElement (By.xpath ("//*[@id=\"___gatsby\"]/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[1]/a"));
        driver.manage ().timeouts ().implicitlyWait (5000, TimeUnit.MILLISECONDS);
        community.click ();
        Set <String> allWindows = driver.getWindowHandles ();
        List <String> list = new ArrayList <String> (allWindows);
        driver.switchTo ().window (list.get (1));
    }


    public void searchTopic (String topic) {

        WebElement searchButton = driver.findElement (By.xpath ("//*[@id='search-button']"));
        searchButton.click ();
        WebElement searchText = driver.findElement (By.xpath ("//input[@id='search-term']"));
        searchText.sendKeys (topic);
    }


    public void goToHamburgerOptions ( ) {
        driver.findElement (By.xpath ("//*[@id='toggle-hamburger-menu']")).click ();
        driver.findElement (By.xpath ("//*[@id='ember6']/header/div/div/div[2]/div/div/div/div/div[2]/ul/li[3]/a")).click ();
    }


}


