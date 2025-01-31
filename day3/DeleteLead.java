package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
			    // 10049
			     //Click on the CRMSFA link
			     driver.findElement(By.linkText("CRM/SFA")).click();
			     
			     //click on lead tab
			     driver.findElement(By.linkText("Leads")).click();
			     
			    //click on find lead tab
			     driver.findElement(By.linkText("Find Leads")).click();
			     
			     //fetch first id
			     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
			     
			     //delete id
			     driver.findElement(By.linkText("Delete")).click();
			     
			     //click findleads button
			     driver.findElement(By.linkText("Find Leads")).click();
			     
			    // 10049
			     //Enter leadsId
			     driver.findElement(By.name("id")).sendKeys("10049");
			     //click on find leads button
			     driver.findElement(By.className("x-btn-text")).click();
	}

}
