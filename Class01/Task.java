package com.company.Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.com/");



       String tittle = driver.getTitle();
        System.out.println("tittle is : "+tittle);

        String url = driver.getCurrentUrl();
        System.out.println("URL is : "+url);
        driver.close();



    }
}
