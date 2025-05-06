import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPathExample {

    public static void main(String[] args) {

        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open local HTML file or web page
        driver.get("file:///path/to/your/user_validation.html"); // Replace with your file path

        // Maximize browser window
        driver.manage().window().maximize();

        // ===== DYNAMIC XPATH EXAMPLES =====

        // 1. Using contains() to locate username field
        WebElement username = driver.findElement(By.xpath("//input[contains(@name, 'user')]"));
        username.sendKeys("admin_user");

        // 2. Using starts-with() for password field
        WebElement password = driver.findElement(By.xpath("//input[starts-with(@id, 'pwd')]"));
        password.sendKeys("admin_pass");

        // 3. Using contains() for email field
        WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'email')]"));
        email.sendKeys("admin@example.com");

        // 4. Using exact text match for the Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();

        // 5. Using partial text for 'Forgot Password?' link
        WebElement forgotLink = driver.findElement(By.xpath("//a[contains(text(), 'Forgot')]"));
        System.out.println("Link Text: " + forgotLink.getText());

        // Close the browser after a pause
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}