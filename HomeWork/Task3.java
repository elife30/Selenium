package com.company.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

    /*
    task3:(use css)
goto:http://syntaxprojects.com/input-form-demo.php
fill in all the textboxes in the form (edited)
     */
    public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/input-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("Yogita");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Bhosle");
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("yogita.salunkhe85@yahoo.com");
        driver.findElement(By.cssSelector("input[name ='phone']")).sendKeys("9786543290");
        driver.findElement(By.cssSelector("input[name='address']")).sendKeys("384BGreat road");
        driver.findElement(By.cssSelector("input[data-bv-field='city']")).sendKeys("Acton");
        driver.findElement(By.cssSelector("select[name='state']")).sendKeys("Mass");
        driver.findElement(By.cssSelector("input[name='zip']")).sendKeys("01720");
        driver.findElement(By.cssSelector("input[name='website']")).sendKeys("Syntax websites");
        driver.close();







    }
}
