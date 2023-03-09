package JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class TestAnnotation1 {

    // @Test notasyonu ile java classının çalışması için gerekli olan main metodu zorunluluğu kalkıyor.
    // @Test notasyonu eklediğimizde metodumuz bağımsız olarak çalışabiliyor
    @Test
    public void test01(){
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

    @Test
    public void test02(){
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
