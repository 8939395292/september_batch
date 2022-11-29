    package selenium_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_class {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\selenium_concepts\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://demoqa.com/alerts");
	
	driver.manage().window().maximize();
	
		
	//WebElement s1 = driver.findElement(By.xpath("//button[@id='alertButton']"));
	
     //s1.click();
	
	//Thread.sleep(4000);
	
	//Alert alert = driver.switchTo().alert();
	
	//alert.accept();
	
	//WebElement s2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	
	//s2.click();
	
	//Thread.sleep(4000);
	
	//Alert alert2 = driver.switchTo().alert();
	
	
	//alert2.dismiss();
	
	WebElement s3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
	
	s3.click();
	
	Thread.sleep(3000);
	
	Alert alert3 = driver.switchTo().alert();
	
	alert3.sendKeys("text");
	

	
	
	}
	

}
