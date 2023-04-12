import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Open the Url into Browser
        driver.get(baseUrl);
        // Maximise the Browser
        driver.manage().window().maximize();
        // We give Implicit wait to driver
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        //Get the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get the page Source
        System.out.println("Page Source: " + driver.getPageSource());

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Enter the Email to Email field
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        // Enter the Password to Password field
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");





    }

}
