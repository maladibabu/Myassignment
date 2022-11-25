package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLinks {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
		
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://leafground.com/");
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//li[@role='menuitem']//span[text()='Hyper Link']")).click();
	
	    List<WebElement> allLinksElements = driver.findElements(By.xpath("//div[@class='card']//a"));
	    
         for (int i=0;i<allLinksElements.size();i++) {
        	 
        	 WebElement webElement = allLinksElements.get(i);
        	 
        	 String text = webElement.getText();
        	 System.out.println(text);
        	 
         }

		
		
		
			
			
			
		
		
	}

}
