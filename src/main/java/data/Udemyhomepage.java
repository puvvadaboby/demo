package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Udemyhomepage {
	public WebDriver driver;
	By course=By.cssSelector("[data-purpose='tab-nav-buttons']");
	
	
	
	public Udemyhomepage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}



	public WebElement courseContainer()
	{
		return driver.findElement(course);
	}
	

}
