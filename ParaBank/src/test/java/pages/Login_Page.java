package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import browserImplementation.BrowserLaunch;
import excelUtility.ExcelReader;
import takeScreenShot.ScreenShot;

public class Login_Page {
	WebDriver driver;
	ExcelReader er;
	ScreenShot ss;
	public Login_Page(WebDriver driver) throws IOException {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\ParaBank\\DataSource\\RegistrationDetails.xlsx";
		er=new ExcelReader(path);
		ss=new ScreenShot(driver);
	}
	
	public void verify_Login_Button() throws Exception {
		int rowcount=er.rowCount(0);
		for (int i = 1; i < rowcount; i++) {
			driver.findElement(By.name("username")).sendKeys(er.getStringData(0, i, 8));
			driver.findElement(By.name("password")).sendKeys(er.getStringData(0, i, 10));
			driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
			Reporter.log("Succesfully Login"+er.getStringData(0, i, 8)+" : "+er.getStringData(0, i, 10));
			Thread.sleep(1000);
			ss.getScreenShot("Logincheck"+i+er.getStringData(0, i, 8));
			driver.findElement(By.partialLinkText("Log Out")).click();
		}
	}

}
