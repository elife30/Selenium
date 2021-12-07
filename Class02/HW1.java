package com.company.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {

/*
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
 */
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Yogita");
        driver.findElement(By.name("customer.lastName")).sendKeys("Bhosle");
        driver.findElement(By.id("customer.address.street")).sendKeys(" 38 Great road");
        driver.findElement(By.id("customer.address.city")).sendKeys("Acton");
        driver.findElement(By.id("customer.address.state")).sendKeys("Masachusetts");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("01720");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("978562283");
        driver.findElement(By.id("customer.ssn")).sendKeys("3118-3244-2233");
        driver.findElement(By.id("customer.username")).sendKeys("Yogita.Bhosle");
        driver.findElement(By.id("customer.password")).sendKeys("Yesdhat@123");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Yesdhat@123");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();

    }



}
