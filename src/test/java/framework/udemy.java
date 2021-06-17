package framework;




import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.Udemyhomepage;
import resources.Base;
public class udemy extends Base {

	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	
	
	@BeforeTest
	public void openingBrowser() throws IOException
	{
		driver= browserInitialisation();
		log.info("browser is invoked");
	}
	  @Test 
	public void udemyApp() 
    {
		driver.get(prop.getProperty("url2"));
		Udemyhomepage uh=new Udemyhomepage(driver);
	Assert.assertFalse( uh.courseContainer().isDisplayed()); 
	log.info("course container is displayed");
	log.error("there is an error");
    }
	  @AfterTest
	  public void closing()
	  {
		  driver.close();
	  }
}


