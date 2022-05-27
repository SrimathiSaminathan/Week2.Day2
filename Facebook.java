package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {

		//For Chrome driver
		WebDriverManager.chromedriver().setup();

		//For Open the browser
		ChromeDriver driver = new ChromeDriver();

		//For url loading
		driver.get("https://en-gb.facebook.com/");

		//For Browser maximizing
		driver.manage().window().maximize();

		//For Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement Facebook = driver.findElement(By.linkText("Create New Account"));
		Facebook.click();
		driver.findElement(By.xpath("id = u_u_b_z6")).sendKeys("Srimathi");
		driver.findElement(By.xpath("id=u_u_d_Ex")).sendKeys("Saminathan");
		driver.findElement(By.id("u_u_g_31")).sendKeys("9600123540");
		driver.findElement(By.id("password_step_input")).sendKeys("Sri01234");
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='day' and @name='birthday_day']"));
		Select bday1 = new Select(ele1);
		bday1.selectByValue("16");
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='month' and @name='birthday_month']"));
		Select bmon = new Select(ele2);
		bmon.selectByValue("06");
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='year' and @name='birthday_year']"));
		Select byr = new Select(ele3);
		byr.selectByValue("1998");
		driver.findElement(By.xpath("//input[@value='1' and @name='sex']")).click();
	}
}
