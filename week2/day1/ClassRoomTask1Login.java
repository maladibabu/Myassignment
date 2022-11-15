package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomTask1Login {

	public static void main(String[] args) throws InterruptedException {
		
		
	//Setup browser driver
	WebDriverManager.chromedriver().setup();
	
	//Lunch the Browser
	ChromeDriver driver=new ChromeDriver();
	
	//load the URL
     driver.get("http://leaftaps.com/opentaps/control/main");
	
	// maximize the browser
    driver.manage().window().maximize();
    
    //Finding elements and passing values.
    
    WebElement eleUserName=driver.findElement(By.id("username"));
    eleUserName.sendKeys("DemoSalesManager");
    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    driver.findElement(By.name("PASSWORD")).sendKeys(Keys.TAB);
    driver.findElement(By.className("decorativeSubmit")).sendKeys(Keys.ENTER);
    
    
    //driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Maladi");
    
    // to find Select Tag element
    WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
    
    // Create the object for Select class
    Select sourceDd=new Select(eleSource);
    
    //to select the value form dropdown
    
    //sourceDd.selectByIndex(2);
    //sourceDd.selectByVisibleText("Conference");
    sourceDd.selectByValue("LEAD_CONFERENCE");
    WebElement firstSelectedOption = sourceDd.getFirstSelectedOption();
    
    //To get the value from webelement
    String text2 = firstSelectedOption.getText();
    
    System.out.println(text2);
    
    driver.findElement(By.name("submitButton")).click();
    String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    
    if (text.equalsIgnoreCase("BAbu"))
    	System.out.println("Text is equal");
    
    else
    	System.out.println("Test is not equal");
    
    
    Thread.sleep(4000);
    //driver.close();
    
		
		
	}
}
