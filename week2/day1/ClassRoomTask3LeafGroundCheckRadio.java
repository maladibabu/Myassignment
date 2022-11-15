package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomTask3LeafGroundCheckRadio {

	public static void main(String[] args) {
		
		//Setup Web Driver Manager
				WebDriverManager.chromedriver().setup();
				
				//Lunch
				ChromeDriver driver=new ChromeDriver();
				//URL
				driver.get("https://leafground.com/checkbox.xhtml");
				//Maximize
				driver.manage().window().maximize();
				//
				driver.findElement(By.id("j_idt87:j_idt89")).click();
				//driver.findElement(By.id("menuform:m_input")).click();
	}
}
