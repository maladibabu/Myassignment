package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		
		
		//Setup browser driver
		WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load application URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To Maximize
		driver.manage().window().maximize();
		
	    // WebElement eleUserName = driver.findElement(By.id("username"));
		
		WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
		
	      eleUserName.sendKeys("DemoSalesManager");
	      
	      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	      
	      driver.findElement(By.className("decorativeSubmit")).click();
	      
	      driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Leads")).click();
	      driver.findElement(By.linkText("Create Lead")).click();
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
	      driver.findElement(By.name("submitButton")).click();
	}
}
