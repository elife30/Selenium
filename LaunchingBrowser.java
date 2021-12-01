package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class LaunchingBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("https://www.google.com/");//navigate to the specified path
        // driver.get("https://www.youtube.com/");//navigate to the specified path
        // driver.get("https://www.amazon.com/");//navigate to the specified path

        //returns the current url in browser
        String url=driver.getCurrentUrl();
        System.out.println("The current url loaded in the browser is : " + url);

        //returns the tittle of the current page
        String tittle= driver.getTitle();
        System.out.println("The current tittle of the page is "+tittle);

        //close the browser
        driver.quit();

    }
}
