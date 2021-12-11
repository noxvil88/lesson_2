package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Book {
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();


        webDriver.get("https://demoqa.com/");
        webDriver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'UserName')]")).sendKeys("Андрей");
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'Password')]')]")).sendKeys("12345");
        webDriver.findElement(By.xpath("//button[text()='Login']]")).click();


        Thread.sleep(10000);
        webDriver.quit();
    }
}
