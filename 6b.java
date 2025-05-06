import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPathLocationStrategy {

    public static void main(String[] args) {

        // Set path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open local HTML file (Update this path to your HTML file)
        driver.get("file:///path/to/your/form.html");

        // Maximize browser window
        driver.manage().window().maximize();

        // ===== Locate elements using dynamic XPath =====

        // Name input using XPath
        WebElement nameField = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
        nameField.sendKeys("John Doe");

        // Email input using XPath
        WebElement emailField = driver.findElement(By.xpath("//input[contains(@name, 'email')]"));
        emailField.sendKeys("john@example.com");

        // Phone Number input using XPath
        WebElement phoneField = driver.findElement(By.xpath("//input[contains(@name, 'phone')]"));
        phoneField.sendKeys("1234567890");

        // Comments textarea using XPath
        WebElement commentsField = driver.findElement(By.xpath("//textarea[contains(@name, 'comment')]"));
        commentsField.sendKeys("This is a sample comment.");

        // Submit Button using Tag Name
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        // Optional pause to see result before closing
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}