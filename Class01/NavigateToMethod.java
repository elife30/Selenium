package com.company.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToMethod {

    public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
        //"Navigate"method can perform action like moving forward,backword & refresh....
        // "get" method does not
        Thread.sleep(2000);//to give a break between excution
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);//
        driver.navigate().back();//first it will open FB then Amazon then go back to FB
        Thread.sleep(2000);
        driver.navigate().forward();
        //diff between close & quit method is
        //close - it will close the current tab we are on
        //quit - it will simply close the whole browser
        driver.close();

    }
}
