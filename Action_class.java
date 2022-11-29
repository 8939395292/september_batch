package selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\LENOVO\\\\eclipse-workspace\\\\selenium_concepts\\\\Driver\\\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://demoqa.com/buttons");
	
	driver.manage().window().maximize();
	
	WebElement single = driver.findElement(By.xpath("//button [text()='Click Me']"));
	
	Actions act =new Actions(driver);
	
	act.click(single).build().perform();
	
	WebElement right = driver.findElement(By.xpath("//button [text()='Right Click Me']"));
	
	act.contextClick(right).perform();
	
	WebElement twoclick = driver.findElement(By.xpath("//button[text( )='Double Click Me']"));
	
	act.doubleClick(twoclick).perform();
	
	driver.navigate().to("https://www.amazon.in/");
	
	Thread.sleep(3000);
	
	WebElement move = driver.findElement(By.xpath("//h2[contains(text( ),'50% off on Selling Fee')]"));
	
	act.moveToElement(move).perform();
	
	driver.navigate().to("https://jqueryui.com/droppable/");
	
	Thread.sleep(3000);
	
	driver.switchTo().frame(0);
	
	WebElement src = driver.findElement(By.id("draggable "));
	
	WebElement target = driver.findElement(By.id("droppable"));
	
	act.dragAndDrop(src, target).perform();
	
	
	

	}

}
