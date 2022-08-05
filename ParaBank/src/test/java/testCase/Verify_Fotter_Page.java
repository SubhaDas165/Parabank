package testCase;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.BrowserLaunch;
import pages.Footer_Page;
import pages.Header_Page;

public class Verify_Fotter_Page {
	static WebDriver driver=null;
	static BrowserLaunch bl;
	static Footer_Page fp;
	@BeforeSuite
	public void launch_Browser() throws Exception {
		Scanner sc= new Scanner(System.in);
		bl=new BrowserLaunch();
		System.out.println("Enetr 1 for Chrome Browser");
		System.out.println("Enetr 2 for Edge Browser");
		System.out.println("Enetr 3 for Firefox Browser");
		int n=sc.nextInt();
		if(n==1) {
			driver=bl.launch_Chrome();
		}
		if(n==2) {
			driver=bl.launch_Edge();
		}
		if(n==3) {
			driver=bl.launch_FireFox();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
  @Test
  public void verify_Fotter_Page() {
	  fp=new Footer_Page(driver);
	  fp.verify_Home_Link();
	  fp.verify_AboutUs_Link();
	  fp.verify_Services_Link();
	  fp.verify_Products_Link();
	  fp.verify_Locations_Link();
	  fp.verify_Forum_Link();
	  fp.verify_SiteMap_Link();
	  fp.verify_ContactUs_Link();
	  fp.verify_Parasoft_Text();
	  fp.verify_VisitUs_Text();
	  fp.verify_Parasoft_Link();
  }
  @AfterSuite
	public void browser_close() {
		driver.quit();
	}
}
