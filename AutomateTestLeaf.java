package selenium.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateTestLeaf {

	public static void main(String[] args) 
	{
		//Open Edge browser
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//Open Application
		driver.get("http://leaftaps.com/opentaps");
		
		//to locate the Username
		WebElement eleusername = driver.findElement(By.id("username"));
		
		//to type username in the text field
		eleusername.sendKeys("Demosalesmanager");
		
		//to locate the password
		WebElement elepwd = driver.findElement(By.id("password"));
		
		//to type password in text fiels
		elepwd.sendKeys("crmsfa");
		
		//to locate login
		WebElement elelogin = driver.findElement(By.className("decorativeSubmit"));
		
		//to click on login button
		elelogin.click();
		

	}

}
