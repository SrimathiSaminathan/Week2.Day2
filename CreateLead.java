package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

//	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {

		//For Chrome driver
		WebDriverManager.chromedriver().setup(); //illegal exception

		//For Open the browser
		ChromeDriver driver = new ChromeDriver();

		//For url loading
		driver.get("http://leaftaps.com/opentaps/control/main");

		//For Browser maximizing
		driver.manage().window().maximize();

		//1st to identify the Webelement

		WebElement eUserName = driver.findElement(By.id("username")); //no such element error
		eUserName.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Entrust");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Srimathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Saminathan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing Team");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation testing in Test leaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("srimathi@testingteam.com");
		WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown = new Select(element);		
		dropdown.selectByVisibleText("New York");

		//1st Identify the Dropdown element
		//	WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));

		//Create Option
		//	Select dropdown = new Select(element);
		//Choose the option
		//	dropdown.selectByValue("LEAD_CONFERENCE");
			Thread.sleep(5000);
		//	dropdown.selectByVisibleText("Conference");
		//	dropdown.selectByIndex(2);
		driver.findElement(By.name("submitButton")).click();	
		System.out.println("Page Title is "+driver.getTitle());
		// To close the browser
				driver.close();
	}
}
