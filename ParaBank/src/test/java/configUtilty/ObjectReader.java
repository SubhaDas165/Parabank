package configUtilty;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ObjectReader {
	Properties Objprop;
	public ObjectReader() throws IOException {
		// TODO Auto-generated constructor stub
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\ParaBank\\ObjectRepository\\Object.properties";
		FileInputStream fis=new FileInputStream(path);
		Objprop =new Properties();
		Objprop.load(fis);
	}
	public String getChromeKey() {
		return Objprop.getProperty("ChromeKey");
	}
	public String getEdgeKey() {
		return Objprop.getProperty("EdgeKey");
	}
	public String getFireFoxKey() {
		return Objprop.getProperty("FireFoxKey");
	}
	public String getChromePath() {
		return Objprop.getProperty("ChromePath");
	}
	public String getEdgePath() {
		return Objprop.getProperty("EdgePath");
	}
	public String getFireFoxPath() {
		return Objprop.getProperty("FireFoxPath");
	}
	public String getBaseUrl() {
		return Objprop.getProperty("BaseUrl");
	}

}
