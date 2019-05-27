package com.revolut.sample.example.FooterPage;

import com.revolut.sample.example.DriverManager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterPage extends DriverManager {

    public void gotToCountryList ( ) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement countryFlag = driver.findElement (By.xpath ("//*[@id='___gatsby']/div/div[5]/div/div[3]/div/div[1]/div[1]/div"));
        js.executeScript ("arguments[0].scrollIntoView(true);", countryFlag);
        js.executeScript ("arguments[0].click();", countryFlag);


    }

    public void selectCountry (String countryName) {
        WebElement country = driver.findElement (By.xpath ("//div[@class='styles__Wrapper-sc-8m2s7m-2 kpRiLD']"));
        List <WebElement> allCountries = country.findElements (By.tagName ("a"));




        for (WebElement countryElement : allCountries)
            {
                if( countryElement.getText ().equalsIgnoreCase (countryName))
                {
                    countryElement.click ();
                    break;
                }
            }




    }

//public void select(String s)
//{
//    WebElement ele=driver.findElement (By.xpath ("//div[@class='styles__Wrapper-sc-8m2s7m-2 kpRiLD']"));
//
//    List<WebElement> cont_a=ele.findElements (By.tagName ("a"));
//
//
//        for(WebElement wele: cont_a)
//      {
//
//          System.out.println (wele.getAttribute ("href"));
//          System.out.println (wele.getText ());
//
//          if(wele.getText ().equalsIgnoreCase (s))
//          {
//              System.out.println (" say hello ");
//
//              wele.click ();
//
//              break;
//          }
//      }
//
//
//}
}
