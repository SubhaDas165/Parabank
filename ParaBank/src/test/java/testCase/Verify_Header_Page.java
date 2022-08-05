package testCase;

import java.io.IOException;
import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.BrowserLaunch;
import pages.Header_Page;


public class Verify_Header_Page {
	static WebDriver driver=null;
	static BrowserLaunch bl;
	static Header_Page hp;
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
	}
  @Test
  public void verify_Header_Page() throws IOException {
	  hp=new Header_Page(driver);
	  hp.verify_Logo();
	  hp.verify_Experience_the_difference_Text();
	  hp.verify_Sollution_Text();
	  hp.verify_AboutUs_Link();
	  hp.verify_Services_Link();
	  hp.verify_Products_Link();
	  hp.verify_Locations_Link();
	  hp.verify_AdminPage_Link();
	  hp.verify_Home_Logo();
	  hp.verify_Aboutus_Logo();
	  hp.verify_Customer_Care_Logo();
  }
  @AfterSuite
	public void browser_close() {
		driver.quit();
	}
}
