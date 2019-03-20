package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbook {
WebDriver driver;
 @BeforeMethod
 public void launch() {
	 System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.get("http:www.amazon.com/amazonprime/");
	 driver.manage().window().maximize();
	 }
	
	@Test
  public void verifyaddbook() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']")).click();
	  
  }
}
