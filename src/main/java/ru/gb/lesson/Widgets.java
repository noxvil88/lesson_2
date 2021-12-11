package ru.gb.lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Widgets {
    public static void main( String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();


        webDriver.get("https://demoqa.com/");
        webDriver.findElement(By.xpath("//h5[text()='Widgets']")).click();
        webDriver.findElement(By.xpath("//span[text()='Accordian']")).click();
        webDriver.findElement(By.xpath("//div[text()='Where does it come from?']")).click();

        Thread.sleep(10000);
        webDriver.quit();
    }
}
