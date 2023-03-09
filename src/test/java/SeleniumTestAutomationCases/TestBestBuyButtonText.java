package SeleniumTestAutomationCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TestBestBuyButtonText {

    /* Test Adımları
   1- https://www.bestbuy.com adresine gidin
   2- Cookies çıkarsa kabul et butonuna basın
   3- Sayfada kaç adet link bulunduğunu yazdırın
   4- Sayfadaki herbir linkin üzerindeki yazıları yazdırın
    */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.bestbuy.com");
        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        System.out.println(buttonList.size());
        for(WebElement each:buttonList){
            System.out.println(each.getText());
        }
    }
}
