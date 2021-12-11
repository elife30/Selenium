package com.company.Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-first-form-demo.php");
        System.out.println( driver.getCurrentUrl());//gives u url in consol
        System.out.println(driver.getTitle());//gives u tittle in consol
        driver.manage().window().maximize();
    driver.findElement(By.cssSelector("input#sum1")).sendKeys("11");
    driver.findElement(By.cssSelector("input#sum2")).sendKeys("22");
    driver.findElement(By.cssSelector("button[onclick$='total()']")).click();
    WebElement result=driver.findElement(By.cssSelector("span#displayvalue"));
       System.out.println(result.getText());





    }
}
