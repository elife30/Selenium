package com.company.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
driver.manage().window().maximize();

//1st method
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");

//2nd method we can add many methods
WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("tester");
        username.click();
        username.clear();
    }


}
