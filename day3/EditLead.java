package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step1: Launch the browser
		ChromeDriver driver=new ChromeDriver();
		 
		//Loading the URL -get
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the browser
	     driver.manage().window().maximize();
	     
	     //sendKeys - To enter data in text field
	     //Enter the username  -findElement
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     
	     //Enter the password
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     //Click on the login button
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     //Click on the CRMSFA link
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     //click on lead tab
	     driver.findElement(By.linkText("Leads")).click();
	     
	     //click on create lead link
			driver.findElement(By.linkText("Create Lead")).click();
			
			//Enter the company name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xxxx");
			
			//Enter first name
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("vinitha");
			
			//Enter the firstName
		     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinitha");
		     
		     //Enter the lastName
		     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Govind");
			
			//Enter lastname
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("govind");
			
			//Enter department name
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
			
			//enter description
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("xyz");
			
			//Enter Email id
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinitha@gmail.com");
			
			//identify webelement createLeadForm_generalStateProvinceGeoId
			WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			Select s=new Select(province);
			
			//Select by visible text
			s.selectByVisibleText("Kansas");
			
			//create lead
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			//click on edit link
			driver.findElement(By.linkText("Edit")).click();
			
			//clear description
			driver.findElement(By.xpath("//textarea[@name='description']")).clear();
			
			//Important note text area
			driver.findElement(By.name("importantNote")).sendKeys("welcome");
			
			//click on update button
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			
			//get tittle of the page
			System.out.println("tittle:"+driver.getTitle());
			
			//close
			driver.close();
	}

}
