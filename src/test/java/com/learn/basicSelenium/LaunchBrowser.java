package com.learn.basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://admin-demo.nopcommerce.com/");
        Thread.sleep(3);
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    }
}
