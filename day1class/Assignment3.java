package week2.day1class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 //window maximize
			driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("SURYA");
		driver.findElement(By.id("lastNameField")).sendKeys("RAJENDIRAN");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("FIRST NAME :SURYA");
		System.out.println("BROWSER TITLE :TESTLEAF");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
