package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import excelUtility.ExcelReader;
import takeScreenShot.ScreenShot;

public class Header_Page {
	WebDriver driver;
	ExcelReader er;
	ScreenShot ss;
	public Header_Page(WebDriver driver) throws IOException {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\ParaBank\\DataSource\\RegistrationDetails.xlsx";
		er=new ExcelReader(path);
		ss=new ScreenShot(driver);
	}
	public void verify_Logo(){
		
		driver.findElement(By.className("logo")).click();
		String ec="ParaBank | Welcome | Online Banking";
		String ac=driver.getTitle();
		assertEquals(ac, ec);
		Reporter.log(ec);
	}
	public void verify_Experience_the_difference_Text() {
		String ac=driver.findElement(By.className("caption")).getText();
		String ec="Experience the difference";
		assertEquals(ac, ec);
		Reporter.log(ac);
	}
	public void verify_Sollution_Text() {
		String ac=driver.findElement(By.className("Solutions")).getText();
		String ec="Solutions";
		assertEquals(ac, ec);
		Reporter.log(ac);
	}
	public void verify_AboutUs_Link() {
		driver.findElement(By.partialLinkText("About Us")).click();
		String ac=driver.findElement(By.className("title")).getText();
		String ec="ParaSoft Demo Website";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_Services_Link() {
		driver.findElement(By.partialLinkText("Services")).click();
		String ac=driver.findElement(By.className("heading")).getText();
		String ec="Available Bookstore SOAP services:";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_Products_Link() {
		driver.findElement(By.partialLinkText("Products")).click();
		String ac=driver.getTitle();
		String ec="Automated Software Testing Tool Suite | Parasoft";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_Locations_Link() {
		driver.findElement(By.partialLinkText("Locations")).click();
		String ac=driver.getTitle();
		String ec="Automated Software Testing Solutions For Every Testing Need";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_AdminPage_Link() {
		driver.findElement(By.partialLinkText("Admin Page")).click();
		String ac=driver.findElement(By.className("title")).getText();
		String ec="Administration";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_Home_Logo() {
		driver.findElement(By.partialLinkText("home")).click();
		String ac=driver.getTitle();
		String ec="ParaBank | Welcome | Online Banking";
		assertEquals(ac, ec);
		Reporter.log(ac);
		
	}
	public void verify_Aboutus_Logo() {
		driver.findElement(By.partialLinkText("about")).click();
		String ac=driver.getTitle();
		String ec="ParaBank | About Us";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}
	public void verify_Customer_Care_Logo() {
		driver.findElement(By.partialLinkText("contact")).click();
		String ac=driver.getTitle();
		String ec="ParaBank | Customer Care";
		assertEquals(ac, ec);
		Reporter.log(ac);
		driver.navigate().back();
	}

}
