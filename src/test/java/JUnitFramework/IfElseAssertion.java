package JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IfElseAssertion {
    /* Assertion Class ile Test
    JUnit assertion (verify/doğrulama) için Assertion Class'ından static metotlar kullanır.
    Bu metotları kullandığımızda sonuçları if-else ile kontrol etmemize ve durumu raporlamak
    için yazdırma işlemine gerek kalmaz.

    En çok kullanılan assertion metotları:
    1- Assert.assertTrue(koşul)
    2- Assert.assertFalse(koşul)
    3- Assert.assertEqual(expected, actual)
    */
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://www.amazon.com");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("aeroplane");
        searchBox.submit();


        WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String actualTextStr = resultText.getText();
        String expectedFindWord = "Traeroplane";

        Assert.assertTrue(actualTextStr.contains(expectedFindWord));

        /* if else ile bu şekilde yazabiliriz.

        if (actualTextStr.contains(expectedFindWord)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
         */
    }
}
