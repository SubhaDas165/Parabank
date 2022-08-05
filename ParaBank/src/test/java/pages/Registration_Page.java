package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import excelUtility.ExcelReader;
import takeScreenShot.ScreenShot;

public class Registration_Page {
	
	WebDriver driver;
	ExcelReader er;
	ScreenShot ss;
	
	By firtname=By.id("customer.firstName");
	By lastname=By.id("customer.lastName");
	By address=By.id("customer.address.street");
	By city=By.id("customer.address.city");
	By state=By.id("customer.address.state");
	By zipcode=By.id("customer.address.zipCode");
	By phone=By.id("customer.phoneNumber");
	By ssn=By.id("customer.ssn");
	By username=By.id("customer.username");
	By password=By.id("customer.password");
	By cpassword=By.id("repeatedPassword");
	public Registration_Page(WebDriver driver) throws IOException {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\ParaBank\\DataSource\\RegistrationDetails.xlsx";
		er=new ExcelReader(path);
		ss=new ScreenShot(driver);
	}
	public void regigterNewUser() throws IOException, InterruptedException {
		
		int rowcount=er.rowCount(0);
		System.out.println(rowcount);
		for (int i = 1; i < rowcount; i++) {
			driver.findElement(By.partialLinkText("Register")).click();
			driver.findElement(firtname).sendKeys(er.getStringData(0, i, 0));
			driver.findElement(lastname).sendKeys(er.getStringData(0, i, 1));
			driver.findElement(address).sendKeys(er.getStringData(0, i, 2));
			driver.findElement(city).sendKeys(er.getStringData(0, i, 3));
			driver.findElement(state).sendKeys(er.getStringData(0, i, 4));
			driver.findElement(zipcode).sendKeys(er.getIntData(0, i, 5)+"");
			driver.findElement(phone).sendKeys(er.getIntData(0, i, 6)+"");
			driver.findElement(ssn).sendKeys(er.getIntData(0, i, 7)+"");
			driver.findElement(username).sendKeys(er.getStringData(0, i, 8));
			driver.findElement(password).sendKeys(er.getStringData(0, i, 9));
			driver.findElement(cpassword).sendKeys(er.getStringData(0, i, 10));
			driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")).click();
			Thread.sleep(1000);
			ss.getScreenShot("RegistrationDone"+i);
			String welcomeac=driver.findElement(By.className("title")).getText();
			String welcomeor="Welcome "+er.getStringData(0, i, 8);
			SoftAssert sa=new SoftAssert();
			sa.assertEquals(welcomeac, welcomeor);
			driver.findElement(By.partialLinkText("Log Out")).click();
			login_Check((er.getStringData(0, i, 8)),(er.getStringData(0, i, 10)));
			Thread.sleep(1000);
			
			
		}
	}
	public void login_Check(String username,String password) throws IOException, InterruptedException {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		Reporter.log("Succesfully Login"+username+" : "+password);
		Thread.sleep(1000);
		ss.getScreenShot("LoginDone"+username);
		driver.findElement(By.partialLinkText("Log Out")).click();



	}

}
