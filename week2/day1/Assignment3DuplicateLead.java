package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment3DuplicateLead {
	public static void main(String[] args) {
		
		
		// Setup WebDriverManager for chromedriver
		WebDriverManager.chromedriver().setup();
		
		//Lunch
		ChromeDriver driver=new ChromeDriver();
		
		//URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//managewindow maximize
		driver.manage().window().maximize();
		
		//findelement and sendkeys using Locator ID
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		//findelement and submit using Locator classname
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//findelement and click on anchor link using Locator linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//findelement and click on anchor link Leads using Locator linkText
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//findelement and sendkeys for test fieds using Locator Id
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Maladi");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suri");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Suri");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead description");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("myemail@gmail.com");
	    
	   // to find Select Tag element
	 WebElement eleProvincedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    
       //create object for Select class
	 Select selectEeleProvincedd=new Select(eleProvincedd);
	 // choose by visiable Text
	 selectEeleProvincedd.selectByVisibleText("New York");
	 //find and click on Create Lead
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 //find the title of the page
	 System.out.println(driver.getTitle());
	 
	//find and click on Edit button by Locator
    driver.findElement(By.linkText("Duplicate Lead")).click();
    
    //Find the company and First name and enter new values
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("New Company TestLeaf");
	
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Surendra Maladi");
		
	//find and click on Edit button by Locator
	
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
	//driver.close();
	}

}
