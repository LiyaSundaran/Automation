package mobile_world;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Home_page {
@Test
	public void register() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Liya.ms/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://mobileworld.banyanpro.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
		driver.findElement(By.xpath("//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[2]/a[1]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Samsung']")).click();
		driver.findElement(By.xpath("//div[@id='samsung']//div[@class='card ']//a[@class='btn btn-primary '][normalize-space()='More Details']")).click();
		driver.findElement(By.xpath("//footer[@class='footer']")).click();
		
		
	
	}

}
