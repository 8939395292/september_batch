    package selenium_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
    
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\selenium_concepts\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver ();
	
	driver.get("https://www.amazon.in/");
	}

}
