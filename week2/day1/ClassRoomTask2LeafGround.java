package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomTask2LeafGround {

	public static void main(String[] args) {
		
		//Setup Web Driver Manager
		WebDriverManager.chromedriver().setup();
		
		//Lunch
		ChromeDriver driver=new ChromeDriver();
		//URL
		driver.get("https://leafground.com/");
		//Maximize
		driver.manage().window().maximize();
		//
		driver.findElement(By.id("menuform:j_idt40")).click();
		driver.findElement(By.id("menuform:m_input")).click();

        //Append data to field
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("TESTTTTT");
		
		 //Clear and SendKeys
		WebElement eleClear= driver.findElement(By.id("j_idt88:j_idt95"));
		eleClear.clear();
		eleClear.sendKeys("Cleared previous test");
		boolean enabled2 = eleClear.isEnabled();
		System.out.println(enabled2);

	  ////Too Check enabled or not
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		
		System.out.println(enabled);
		
		  ////Getting the value present in text box
		String stringtext = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println(stringtext);
		
		//Has doubt at this
		driver.findElement(By.id("menuform:j_idt40")).click();
	
		driver.close();
		
		
		
		
		//checkbox selection
		//driver.findElement(By.id("j_idt87:j_idt89")).click();
		
		
		
		
		
		
	}
	
}
