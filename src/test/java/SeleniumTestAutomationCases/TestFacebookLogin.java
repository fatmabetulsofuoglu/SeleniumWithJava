package SeleniumTestAutomationCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestFacebookLogin {

    /* Test Adımları
   1- https://www.facebook.com adresine gidin.
   2- Cookies çıkarsa kabul et butonuna basın
   3- E-posta kutusuna rastgele bir mail girin
   4- Şifre kutusuna rastgele bir şifre girin
   5- Giriş Yap butonuna tıklayın
   6- Giriş yapılamadığını test edin.
   7- Sayfayı kapatın
   */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");
        //driver.findElement(By.xpath("//button[@title='Allow esential and optional cookies']")).click();

        WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
        mail.sendKeys("asdfgh");

        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("asdfgh");

        driver.findElement(By.xpath("//button[@name='login']")).click();

        driver.close();
    }
}
