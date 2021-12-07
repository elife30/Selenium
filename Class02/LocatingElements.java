package com.company.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Watchable;

public class LocatingElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("yogitnn@ga");
        driver.findElement(By.name("email")).sendKeys("hdahd@dhg");
        driver.findElement(By.name("pass")).sendKeys("yogita#hk");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

        driver.findElement(By.partialLinkText("open-registration")).click();


    }
}
