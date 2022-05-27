package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
		driver.findElement(By.xpath("//span[@class='x-tab-strip-text ' and text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("srimathi@testingteam.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		WebElement e1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[@class='linktext']"));
		String leadName = e1.getText();
		e1.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String pageTitle = driver.getTitle();
		String text = "Duplicate Lead | opentaps CRM";
		if(text.equals(pageTitle)) {
			System.out.println("Page title is verified");
		}
		else {
			System.out.println("Page title is mismatch");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement ele2 = driver.findElement(By.id("viewLead_firstName_sp"));
		String dup = ele2.getText();
		if(dup.equals(leadName)) {
			System.out.println("Duplicated lead name and Captured name are same");
		}
		else {
			System.out.println("No duplication");
		}
		driver.close();
}
}