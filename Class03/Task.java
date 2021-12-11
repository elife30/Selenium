package com.company.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='list-group-item' and text()='Simple Form Demo']")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();


        System.setProperty("weddriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.instagram.com/");
        driver1.manage().window().maximize();
        driver1.findElement(By.xpath("//input[@name='username']")).sendKeys("Yogita");
        driver1.findElement(By.xpath("//input[@type='password']")).sendKeys("redfsg");





    }
}
