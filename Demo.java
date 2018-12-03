package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
//		Object profile = ((Object) driver).FirefoxProfile();
//		profile.set_preference("dom.disable_open_during_load", False);
//		driver = WebDriver.Firefox(profile);
		
		//Opening the site https://app.openmailbox.org/login
		
		driver.get("https://app.openmailbox.org/login");
		
		//Creation of new account
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.id("register_id")).sendKeys("yashaswini123456");
		driver.findElement(By.id("register_pw")).sendKeys("Milan@123");
		driver.findElement(By.id("register_vpw")).sendKeys("Milan@123");
		driver.findElement(By.xpath("//*[@id='register']")).click();
		
		//Verify the new account creates successfully
		
		
		
	}
}
