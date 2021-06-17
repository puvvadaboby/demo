package resources;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Base   {
	
	
	public WebDriver driver;
	public Properties prop;

	
	
	public WebDriver browserInitialisation() throws IOException
	{
	 prop=new Properties();	
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\data.properties");
	prop.load(fis);
	//String browserName=System.getProperty("browser");
	//System.out.println(browserName);
	String browserName=prop.getProperty("browser");
	if(browserName.contains("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
	 
	if(browserName.contains("headless"))
	  options.addArguments("--headless");
	driver=new ChromeDriver();
	}
	else if(browserName.equals("firefox"))
	{
		 driver=new FirefoxDriver();
	}
	
	else if(browserName.equals("IE"))
	{
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;

	}
	public String getClassName(String testMethodName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testMethodName+".png";
		
		FileUtils.copyFile(screenshot, new File(destinationFile));
		return destinationFile;
		
	}
	
	
	

}
