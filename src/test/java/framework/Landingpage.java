package framework;



import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.Homepage;
import data.Loginpage;
import resources.Base;

public class Landingpage extends Base {
	
	@Test(dataProvider="getData")
	public void landingPage(String email) 
	{
	System.out.println("we are on landing page");
	
	driver.get(prop.getProperty("url1"));
	Homepage hp=new Homepage(driver);
	
    Loginpage lp=hp.gamil();
	lp.emailid().sendKeys(email);
	lp.next().click();
	
	}
	@DataProvider
	public Object[][] getData()
	{
	Object[][] data=new Object[2][1];
	data[0][0]="bavitha";
	data[1][0]="bindu";
	return data;

	}
	  @AfterTest
	  public void close()
	  {
		  driver.close();
	  }
	  @BeforeTest
		public void openingBrowser() throws IOException
		{
			driver= browserInitialisation();
		}

}
