// Gizer Doğan 18070006036
// Umut Emre Çelik 18070006039
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewRegistration {
    @Test
    public void Newregistrationsucces() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/GİZER/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("register")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstName")).sendKeys("Gizer");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("Doğan");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("se2226Project@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Ab123456");
        Thread.sleep(2000);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }

    @Test
    public void Sameemailregistration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/GİZER/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("register")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstName")).sendKeys("Gizer");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("Doğan");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("gizerdogan@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123456Ab");
        Thread.sleep(2000);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }

    @Test
    public void Newregistrationinvalidpassword() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/GİZER/Desktop/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("sf-OldMyAccount-PhY-T")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("register")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstName")).sendKeys("Gizer");
        Thread.sleep(2000);
        driver.findElement(By.name("lastName")).sendKeys("Doğan");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("mugedogan68@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("checkSubscribeEmail")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnSignUpSubmit")).click();
    }
}
