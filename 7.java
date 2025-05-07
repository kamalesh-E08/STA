import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testing
{
public static void main(String[] args) throws InterruptedException
{
WebDriver obj = new ChromeDriver();
obj.get("https://www.w3schools.com/dsa/dsa_intro.php");
obj.manage().window().maximize();
WebElement mouse = obj.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]"));
Actions hover=new Actions(obj);
hover.moveToElement(mouse).build().perform();
Thread.sleep(3000);
obj.close();
}
}