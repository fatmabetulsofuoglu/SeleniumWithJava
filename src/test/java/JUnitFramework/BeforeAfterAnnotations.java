package JUnitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BeforeAfterAnnotations {
    WebDriver driver;

    // @Before her metottan önce çalışır.
    // @After her metottan sonra çalışır.
    // @BeforeClass ve @AfterClass notasyonları ise sadece classın çalışmasının öncesinde ve sonrasında çalışır
    // @BeforeClass ve @AfterClass kullanıldığında metotlar static olmalıdır.
    // @Ignore görmezden gel demek için kullanılır.
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        driver.get("https://www.facebook.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void test03() {
        driver.get("https://www.amazon.com");
    }
}
