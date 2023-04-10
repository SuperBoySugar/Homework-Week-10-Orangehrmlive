import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {

    static String browser = "Chrome";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();

        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        // Open the Url
        driver.get(baseUrl);
        // Title of the Page
        String title = driver.getTitle();
        System.out.println(title);
        // Print Current Url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("Current URL: " + driver.getCurrentUrl());
        // Get the Page Source
        System.out.println("Page Source: " + driver.getPageSource());
        // Login link Element
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        // Enter the password to password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");


    }
}
