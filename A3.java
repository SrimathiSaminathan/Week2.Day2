package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3 {
	//	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {

		//For Chrome driver
		WebDriverManager.chromedriver().setup();

		//For Open the browser
		ChromeDriver driver = new ChromeDriver();

		//For url loading
		driver.get("https://acme-test.uipath.com/login");

		//For Browser maximizing
		driver.manage().window().maximize();

		WebElement mail = driver.findElement(By.id("email")); 
		mail.sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//Xpath (Elder cousin to younger cousin)
		driver.findElement(By.xpath("//div[@class = 'control-group form-group']/following::button[@class='btn btn-primary']")).click();
		//Print Page Title
		System.out.println("Page Title is "+driver.getTitle()); 
		//To Click Logout Button
		driver.findElement(By.linkText("Log Out")).click();
		// To close the browser
		driver.close();

	}

}
