package DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.get("url") --> url'e gider
        driver.get("https://www.amazon.com");

        // 2- driver.getTitle() --> sayfanın başlığını döndürür
        System.out.println("Sayfa title: " + driver.getTitle());

        // 3- driver.getCurrentUrl() --> içinde olduğu sayfanın url'ini döndürür.
        System.out.println(driver.getCurrentUrl());

        // 4- driver.getPageSource() --> sayfanın kaynak kodunu string döndürür.
        System.out.println(driver.getPageSource());

        // 5- driver.getWindowHandle() --> içinde bulunduğu sayfanın UNIQUE hash kodunu döndürür.
        System.out.println(driver.getWindowHandle());

        // 6- driver.getWindowHandles() -->  driver çalışırken açılan tüm sayfaların UNIQUE hash kodunu döndürür
        

    }
}
