package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hasznaltauto.hu/");
        WebElement accept = driver.findElement(By.id("didomi-notice-agree-button"));
        accept.click();
        WebElement login = driver.findElement(By.xpath("//a[@data-toggle='login']"));
        login.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("mui-1"));

        Thread.sleep(3000);
        username.sendKeys("");
        password.sendKeys("");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
    }
}