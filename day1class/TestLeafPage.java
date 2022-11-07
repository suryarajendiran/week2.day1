package week2.day1class;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 String title=driver.getTitle();
		 driver.findElement(By.linkText("crmsfa/control/main?externalLoginKey=EL9204973240")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SURYA");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendiran");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("hello");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suryarajendiran@gmails.com");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
}
}
