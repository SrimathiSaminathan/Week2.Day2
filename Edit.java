package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		
		//For Chrome driver
		WebDriverManager.chromedriver().setup(); 

		//For Open the browser
		ChromeDriver driver = new ChromeDriver();

		//For url loading
		driver.get("http://leaftaps.com/opentaps/control/main");

		//For Browser maximizing
		driver.manage().window().maximize();
		
		WebElement eUserName = driver.findElement(By.id("username"));
		eUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Srimathi");	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		System.out.println("Page Title is "+driver.getTitle());		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Tcs");
		String text = driver.findElement(By.id("updateLeadForm_companyName")).getText();
		Thread.sleep(2000); 
		System.out.println(text);
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();		 
		String changeText = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		System.out.println(changeText);
		//Text change verification
		if (changeText.contains(text))
		{ 
			System.out.println(" Changed Text is confirmed");
		} else { System.out.println(" Change Text is not confirmed"); }
		//Close the browser 
         driver.close();

	}

}
