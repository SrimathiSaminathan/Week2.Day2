package week2.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead1 {

//	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {

		//For Chrome driver
		WebDriverManager.chromedriver().setup();

		//For Open the browser
		ChromeDriver driver = new ChromeDriver();

		//For url loading
		driver.get("http://leaftaps.com/opentaps/control/main");

		//For Browser maximizing
		driver.manage().window().maximize();

		//1st to identify the Webelement

		WebElement eUserName = driver.findElement(By.xpath("//input[@id='username']")); 
		eUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Entrust");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Srimathi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Saminathan");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sri");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing Team");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Automation testing in Test leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("srimathi@testingteam.com");
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropdown = new Select(element);		
		dropdown.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();	
		System.out.println("Page Title is "+driver.getTitle());
//		driver.close();
	}
}

