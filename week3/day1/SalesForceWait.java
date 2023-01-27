package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class SalesForceWait {

	public static void main(String[] args) {
		    ChromeOptions option = new ChromeOptions();
            option.addArguments("--disable-notifications");
		    ChromeDriver driver=new ChromeDriver(option);
	        driver.manage().window().maximize();
	        driver.get("https://login.salesforce.com/");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	        driver.findElement(By.id("password")).sendKeys("Testleaf$321");
	        driver.findElement(By.id("Login")).click();
	        driver.findElement(By.className("slds-icon-waffle")).click();
	        driver.close();
	}

}
