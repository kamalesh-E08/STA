import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class Main {
public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("D:///path/to/your/html/index.html");
driver.manage().window().maximize();
WebElement popupButton = driver.findElement(By.id("popupButton"));
popupButton.click();
Thread.sleep(2000);
String mainWindowHandle = driver.getWindowHandle();
Set<String> allWindowHandles = driver.getWindowHandles();
for (String handle : allWindowHandles) {
if (!handle.equals(mainWindowHandle)) {
driver.switchTo().window(handle);
break;
}
}
driver.switchTo().window(mainWindowHandle);
driver.quit();
}
}