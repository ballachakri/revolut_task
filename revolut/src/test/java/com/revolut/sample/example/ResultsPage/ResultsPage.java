package com.revolut.sample.example.ResultsPage;

import com.revolut.sample.example.DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {

    public String toGetCurrentURL ( ) {
        String current_url = driver.getCurrentUrl ();
        return current_url;
    }

    public String getSearchedTopic ( ) {
        String searchedTopic = driver.findElement (By.xpath ("//*[@id='ember6']/header/div/div/div[2]/div/div/div/div/div[3]/div/div/ul/li[1]/a")).getText ();
        return searchedTopic;
    }

    public ArrayList <String> getAllKeyboardShortcuts ( ) {
        WebElement keys = driver.findElement (By.xpath ("//*[@id='keyboard-shortcuts-help']"));
        List <WebElement> allKeys = keys.findElements (By.tagName ("li"));
        ArrayList <String> listOfKeys = new ArrayList <String> ();
        for (int i = 0; i < allKeys.size (); i++) {
            listOfKeys.add (allKeys.get (i).getText ());
        }

        return listOfKeys;
    }


}
