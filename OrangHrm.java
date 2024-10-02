package TNGDay1;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangHrm {
	WebDriver driver;
  @Test
  void openapp()
  {
	 driver =new ChromeDriver(); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
  }
  @Test
  void Testlogo()  throws InterruptedException
  {
	  Thread.sleep(3000);
	  boolean status =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]")). isDisplayed();
	  System.out.println("logo Displayed..."+status);
	  
  }
  @Test
	void Testlogin()
	{
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin@123");
	  driver.findElement(By.xpath("button=login")).click();
	}
  
  @Test
  void closeapp()
  {
	  driver.quit();
  }
  }

	


