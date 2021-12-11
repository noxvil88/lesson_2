package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Interactions {

    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();


        webDriver.get("https://demoqa.com/");
        webDriver.findElement(By.xpath("//h5[text()='Interactions']")).click();
        webDriver.findElement(By.xpath("//span[text()='Selectable']")).click();
        webDriver.findElement(By.xpath("//li[text()='Cras justo odio']")).click();

        Thread.sleep(10000);
        webDriver.quit();
    }
}
