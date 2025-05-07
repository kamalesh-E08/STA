import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
public class Second
{
public static void main(String[] args)
{
// System Property for Gecko Driver
System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );
// Initialize Gecko Driver using Desired Capabilities Class
DesiredCapabilities capabilities = DesiredCapabilities.firefox();
capabilities.setCapability("marionette",true);
WebDriver driver= new FirefoxDriver(capabilities);
driver.navigate().to("http://www.javatpoint.com/"); // Launch Website
driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");
// Click on the Search button
driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();
}
}