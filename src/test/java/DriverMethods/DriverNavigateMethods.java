package DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.navigate().to("url") --> istenen url'e gider.
        //    driver.get("url") ile aynı işlemi yapar ama forward ve back işlemi yapılmasına imkan tanır.
        driver.get("https:www.facebook.com");
        driver.navigate().to("https://www.amazon.com");

        // 2- driver.navigate.back() --> navigate.to ile gidilen sayfadan bir önceki sayfaya gitmeye yarar.
        driver.navigate().back();

        // 3- driver.navigate.forward() --> back ile geri gttiğimiz sayfaya geri döner. Yani bir sonraki sayfaya gider.
        driver.navigate().forward();

        // 4- driver.navigate.refresh() --> sayfayı yeniler
        driver.navigate().refresh();

        // 5- driver.close() --> driver ile açılan bir windowu kapatır.
        // 6- driver.quit() -- > tüm sekmeleri sayfaları kapatır.
        //    driver.close ve driver.quit aynı anda çalışmaz.
    }
}
