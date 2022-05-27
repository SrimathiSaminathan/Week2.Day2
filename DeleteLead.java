package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
		WebElement ele1 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[@class='linktext']"));
		String Id = ele1.getText(); 
		ele1.click(); 
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID')]/following-sibling::div/input")).sendKeys(Id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.close();

	}
}
