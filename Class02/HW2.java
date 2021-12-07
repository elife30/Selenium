package com.company.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) throws InterruptedException {

    /*
    HW2
navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up button
close the pop up
close the browser (edited)
     */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Yogita");
        driver.findElement(By.name("lastname")).sendKeys("Bhosle");
        driver.findElement(By.name("reg_email__")).sendKeys("9788528699");
        driver.findElement(By.id("password_step_input")).sendKeys("Redhat@344");
        driver.findElement(By.name("birthday_month")).sendKeys("July");
        driver.findElement(By.name("birthday_day")).sendKeys("29");
        driver.findElement(By.name("birthday_year")).sendKeys("1985");
        driver.findElement(By.linkText("Female")).click();
        Thread.sleep(300);
        driver.findElement(By.linkText("Sign Up")).click();
       // driver.findElement(By.name("websubmit")).click();
        driver.close();


    }
}
