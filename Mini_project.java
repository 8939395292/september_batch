package selenium_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_project {

	public static void main(String[] args) throws InterruptedException, Exception { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\selenium_concepts\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		
		username.sendKeys("8939395292");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		
		password.sendKeys("Rajesh@123");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		
		login.click();
		
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		
		loc.click();
		
		Robot r = new Robot (); 
		
		r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);		
	     
		
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);	
        
        WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
        
        hotels.click();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
        
        room.click();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement nos = driver.findElement(By.xpath("//select[@id='room_nos' ]"));
        
        nos.click();
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
       WebElement adults = driver.findElement(By.xpath("//select[@name='adult_room' ]"));
       
       adults.click();
       
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       
       WebElement children = driver.findElement(By.xpath("//select[@name='child_room' ]"));
       
       children.click();
       
       r.keyPress(KeyEvent.VK_DOWN);
       r.keyRelease(KeyEvent.VK_DOWN);
       
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
       
       WebElement submit = driver.findElement(By.xpath("//input[@type='submit' ]"));
       
       submit.click();
       
       WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
       
       radio.click();
       
       WebElement con = driver.findElement(By.xpath("//input[@name='continue']"));
       
       con.click();
       
       WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
       
       name.sendKeys("Rajesh");
       
       WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
       
       last.sendKeys("M");
       
      WebElement adress = driver.findElement(By.xpath("//textarea[@name='address']"));
      
      adress.sendKeys("6.ganapathy kovil st,chennai-71");
      
      WebElement cc = driver.findElement(By.xpath("//input[@name='cc_num']"));
      
      cc.sendKeys("9878965473271564");
      
      WebElement card = driver.findElement(By.xpath("//select[@name='cc_type']"));
      
      card.click();
      
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      WebElement mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
      
      mon.click();
      
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
      
      year.click();
      
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
      
      cvv.sendKeys("756");
      
      WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
      
      book.click();
      
      
      
      
      
      
      
      
      
       
       
       
        
        
        
        
        
	     
		
		
		
		

	}

}
