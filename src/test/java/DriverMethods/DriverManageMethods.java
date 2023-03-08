package DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 1- driver.manage().window().getSize() --> içinde olduğu sayfanın px ölçülerini döndürür.
        System.out.println(driver.manage().window().getSize());

        // 2- driver.manage().window().getPosition() --> sol alt köşeden sağa ve yukarı pozisyonunu verir
        System.out.println(driver.manage().window().getPosition());

        // 3- driver.manage().window().setPosition() --> konumunu biz belirleyebiliriz.
        driver.manage().window().setPosition(new Point(100, 100));

        // 4- driver.manage().window().setSize() --> pencerenin boyutunu belirleyebiliriz
        driver.manage().window().setSize(new Dimension(900, 600));

        // 5- driver.manage().window().maximize() --> Ekranı tamamen kaplayan çerçeveli pencere
        driver.manage().window().maximize();
        System.out.println("Maksimize konum: " + driver.manage().window().getPosition()); // (-8, -8)
        System.out.println("Maksimize boyut: " + driver.manage().window().getSize()); // (1936,1048)

        // 6- driver.manage().window().fullscreen() --> Full ekran pencere
        driver.manage().window().fullscreen();
        System.out.println("Fullscreen konum: " + driver.manage().window().getPosition()); // (0, 0)
        System.out.println("Fullscreen boyut: " + driver.manage().window().getSize()); // (1920, 1080)

        // 7- driver.manage().window().minimize() --> simge durumunda küçültür
        driver.manage().window().minimize();

        /* 8- driver.manage().timeouts().implicitlyWait() --> her class için yapılması gereken bir ayardır.
        driver'a sayfanın yüklenmesi ve kullanacağımız web elementlerinin bulunması için bekleyeceği max süreyi belirtir.
        driver bu süre içerisinde sayfa yüklenir/web element bulunursa beklemeden çalışmaya devam eder.
        Bu süre bittiğinde sayfa yüklenmemiş/web element bulunmamışsa exception vererek çalışmayı durdurur.
        *imliciptly  - kibarca

        Duration.ofSeconds(15) --> Duration class'ı Selenium 4 ile gelen zaman classıdır. Driver'a ne kadar bekleyeceğini
        söyler. Milis, minutes, hours gibi zaman dilimleri de mevcuttur.

        */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
