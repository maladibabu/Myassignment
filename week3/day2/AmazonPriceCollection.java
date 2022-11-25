package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPriceCollection {


public static void main(String[] args) {
		
		//Setup Web Driver Manager
		WebDriverManager.chromedriver().setup();
		
		//Lunch
		ChromeDriver driver=new ChromeDriver();
		//URL
		driver.get("https://www.amazon.in/");
		//Maximize
		driver.manage().window().maximize();
		
		WebElement findElement = driver.findElement(By.xpath("//form[@class='nav-searchbar nav-progressive-attribute']//input"));
		findElement.sendKeys("Mobile");
		findElement.sendKeys(Keys.ENTER);
         
	    List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price']"));
	    
	    List <Integer> outputlist=new ArrayList<Integer>();
        
	    
	  for (int i = 0; i < findElements.size(); i++) {
		  WebElement webElement = findElements.get(i);
		  String text1=webElement.getText();
		  String text2=text1.replaceAll("[^a-zA-Z0-9]", "");
		  
		  System.out.println(text2);
		 
		  
		  int num=Integer.parseInt(text2);
		  outputlist.add(num);
		 
		
		  	  
	}
	  Collections.sort(outputlist);
	  System.out.println("  Test  " +outputlist.get(0));
	  
	
	  System.out.println("  Test1  " +outputlist);

	
		
}
}

