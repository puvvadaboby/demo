package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	private By gmail=By.xpath("//a[text()='Sign in']");
	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public Loginpage gamil()
	{
	 driver.findElement(gmail).click();
	 Loginpage lp=new Loginpage(driver);
	 return lp;
	}
	

}
