package KiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CrossBroUtilityList 
{

	public static String getDataFromPropFile(String key) throws IOException 
	{
		Properties prop =new Properties(); // Created Object Of Properties Class.
		FileInputStream myfile= new FileInputStream("C:\\Users\\kuldip wade\\eclipse-workspace\\Kuldip_Selenium\\Myproperties1.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
	}

	public static void getScreenShot(WebDriver driver , String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dec=new File("C:\\Users\\kuldip wade\\Pictures\\Saved Pictures\\MyScrn"+TCID+".png");
		
		FileHandler.copy(src, dec);
		
	}
	

}
