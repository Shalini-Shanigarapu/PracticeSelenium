package com.learn.basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
        //driver.findElement(By.xpath("//div[contains(@id,'SubscriptionAgreement')]/preceding-sibling::div[contains(@class,'checkbox-ui')]")).click();
        // Nested frame
    driver.get("https://the-internet.herokuapp.com/nested_frames");
    driver.switchTo().frame("frame-top");
    driver.switchTo().frame("frame-middle");
    WebElement text = driver.findElement(By.xpath("//div[text()='MIDDLE']"));
       System.out.println(text.getText());
       driver.close();

        //iframes
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("Testcase");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("(//*[local-name()='svg']/ancestor::button[@class='tox-tbtn'])[5]")).click();

    }

}
