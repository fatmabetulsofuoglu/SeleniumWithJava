package SeleniumTestAutomationCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestAmazonSearchBox {

    /* Test Adımları
   1- https://www.amazon.com adresine gidin.
   2- Arama kutusuna "aeroplane" yazdırın.
   3- Enter'a basarak arama işlemini yaptırın.
   4- Bulunan sonuç sayısını yazdırın.
   */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("aeroplane");
        searchBox.submit();

        WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(resultText.getText());

        driver.close();
    }
}
