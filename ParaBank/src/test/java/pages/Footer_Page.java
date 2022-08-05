package pages;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Footer_Page {
	WebDriver driver;
	public Footer_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void verify_Home_Link() {
		driver.findElement(By.partialLinkText("Home")).click();
		String ec="ParaBank | Welcome | Online Banking";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_AboutUs_Link() {
		driver.findElement(By.partialLinkText("About Us")).click();
		String ec="ParaBank | About Us";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_Services_Link() {
		driver.findElement(By.partialLinkText("Services")).click();
		String ec="ParaBank | Services";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_Products_Link() {
		driver.findElement(By.partialLinkText("Products")).click();
		String ec="Automated Software Testing Tool Suite | Parasoft";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_Locations_Link() {
		driver.findElement(By.partialLinkText("Locations")).click();
		String ec="Automated Software Testing Solutions For Every Testing Need";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_Forum_Link() {
		driver.findElement(By.partialLinkText("Forum")).click();
		String ec="Welcome to the Forums";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_SiteMap_Link() {
		driver.findElement(By.partialLinkText("Site Map")).click();
		String ec="ParaBank | Site Map";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_ContactUs_Link() {
		driver.findElement(By.partialLinkText("Contact Us")).click();
		String ec="ParaBank | Customer Care";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();

	}
	public void verify_Parasoft_Text() {

		String ec="© Parasoft. All rights reserved.";
		String ac=driver.findElement(By.className("copyright")).getText();
		assertEquals(ac, ec);
		Reporter.log(ac);
		

	}
	public void verify_VisitUs_Text() {

		String ec="Visit us at:";
		String ac=driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[2]/li[1]")).getText();
		assertEquals(ac, ec);
		Reporter.log(ac);
		

	}
	public void verify_Parasoft_Link() {
		driver.findElement(By.partialLinkText("www.parasoft.com")).click();
		String tab1=driver.getWindowHandle();
		ArrayList<String> availableWindows=new ArrayList<String>(driver.getWindowHandles());
		if(!availableWindows.isEmpty()) {
			driver.switchTo().window(availableWindows.get(1));			
		}
		String ec="Automated Testing to Deliver Superior Quality Software | Parasoft";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.close();
	}




}
