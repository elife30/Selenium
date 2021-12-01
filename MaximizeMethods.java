package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("https://www.google.com/");//navigate to the specified path

        //to maximize the window
        driver.manage().window().maximize();

        //one step above maximization full screen on the browser
        driver.manage().window().fullscreen();



    }
}
