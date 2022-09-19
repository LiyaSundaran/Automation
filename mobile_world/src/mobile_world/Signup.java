
package mobile_world;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Signup{

	WebDriver driver;
    @Test
    public void register() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Liya.ms\\Downloads\\chromedriver_win32\\chromedriver.exe");
         driver = new ChromeDriver();
        
        driver.get("https://mobileworld.banyanpro.com/");
        driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
        driver.findElement(By.linkText("Sign up")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Liya");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("M S");
        driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("liya999@gmail.com");
        driver.findElement(By.xpath("//input[@type='Password']")).sendKeys("Liya@123");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("28");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("1999");
        driver.findElement(By.xpath("//input[@type='radio']")).click();
        driver.findElement(By.xpath("//input[@min='0']")).sendKeys("7891011123");
        driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Qualitester");
        driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
        driver.switchTo().alert().accept();
    }
}