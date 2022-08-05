package testCase;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.BrowserLaunch;
import pages.Login_Page;

@Test
public class Verify_Login_Page {
	static WebDriver driver=null;
	static BrowserLaunch bl;
	static Login_Page lp;
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
	public void loginPage() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		lp=new Login_Page(driver);
		
		lp.verify_Login_Button();
		
		
	}
	@AfterSuite
	public void browser_close() {
		driver.quit();
	}

}
