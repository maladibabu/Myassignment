package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomTask3LeafGroundDropdown {

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
		
	    driver.findElement(By.id("menuform:m_dropdown")).click();
	    
	    //Find  the select Tag element
	    WebElement eleDrop = driver.findElement(By.className("ui-selectonemenu"));
	    
	  // Create the Object for Select Class
	    Select selDropdown=new Select(eleDrop);
	    
	    //choose the option
	    //selDropdown.selectByIndex(1);
	   selDropdown.selectByVisibleText("Playwright");
	    //selDropdown.selectByValue("")
	   
	   // when we don't have the Select Tag
	    
	  // WebElement eleDrop = driver.findElement(By.className("ui-selectonemenu"));
	   //eleDrop.click();
	  // driver.findElement(By.className("")).click();
	   
}
}