package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	WebDriver driver;
	public ScreenShot(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void getScreenShot(String imageName) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(".\\ScreenShot\\"+imageName+".png");
		org.openqa.selenium.io.FileHandler.copy(file, target);
	}

}
