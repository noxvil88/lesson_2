package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class Elements {
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();


        webDriver.get("https://demoqa.com/");
        webDriver.findElement(By.xpath("//h5[text()='Elements']")).click();
        webDriver.findElement(By.xpath("//span[text()='Text Box']")).click();
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'Full Name')]")).sendKeys("Андрей");
        webDriver.findElement(By.xpath("//input[contains(@placeholder,'name@example.com')]")).sendKeys("asd@mail.ru");
        webDriver.findElement(By.xpath("//textarea[contains(@placeholder,'Current Address')]")).sendKeys("пр.Королева");
        webDriver.findElement(By.xpath("//textarea[contains(@id,'permanentAddress')]")).sendKeys("ул.Мира");
        webDriver.findElement(By.xpath("//button[text()='Submit']")).click();

        Thread.sleep(10000);
        webDriver.quit();
    }
}
