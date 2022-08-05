package browserImplementation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configUtilty.ObjectReader;

public class BrowserLaunch {
	ObjectReader obj;
	WebDriver driver;
	
	String Cpath;
	String Epath;
	String Fpath;
	
	String Ckey;
	String Ekey;
	String Fkey;
	
	String Url;
	public BrowserLaunch() throws IOException {
		// TODO Auto-generated constructor stub
		obj= new ObjectReader();
		Cpath=obj.getChromePath();
		Epath=obj.getEdgePath();
		Fpath=obj.getFireFoxPath();
		Ckey=obj.getChromeKey();
		Ekey=obj.getEdgeKey();
		Fkey=obj.getFireFoxKey();
		Url=obj.getBaseUrl();
		System.setProperty(Ckey, Cpath);
		System.setProperty(Ekey, Epath);
		System.setProperty(Fkey, Fpath);
	}
	public WebDriver launch_Chrome() {
		driver=new ChromeDriver();
		driver.get(Url);
		return driver;
	}
	public WebDriver launch_Edge() {
		driver=new EdgeDriver();
		driver.get(Url);
		return driver;
	}
	public WebDriver launch_FireFox() {
		driver=new FirefoxDriver();
		driver.get(Url);
		return driver;
	}

}
