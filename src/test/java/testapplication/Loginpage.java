package testapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage {

	public WebDriver driver;

	@BeforeTest
	public void openChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void Login() {
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void user() {
		driver.findElement(By.id("email")).sendKeys("9000792764");
		driver.findElement(By.id("pass")).sendKeys("Amar@2233");
		driver.findElement(By.name("login")).click();

	}
}
