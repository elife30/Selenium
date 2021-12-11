package com.company.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {

        /*
        task2:(use advance xpath)
RMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
enter wrong password
Click on login button
Verify error message with text “Invalid Credenitals” is displayed.
         */

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe") ;
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//span[@class='form-hint']/preceding-sibling::input)[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("//div[@id='divPassword']/child::input")).sendKeys("xghxg!22");
        driver.findElement(By.xpath("//div[@id='divLoginButton']/input")).click();
        WebElement print =driver.findElement(By.xpath("//input[@type='submit']/following-sibling::span"));
        System.out.println(print.getText());
        driver.close();

    }
}
