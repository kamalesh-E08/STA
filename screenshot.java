import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;

public class screenshot {
public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
driver.get("https://github.com/");
driver.manage().window().maximize();
File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
screenshotFile.renameTo(new File("C:\\Users\\Administrator\\Desktop\\screenshot\\screenshot.png"));
driver.quit();
}
}