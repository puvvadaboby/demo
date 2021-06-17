package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
 private By email=By.cssSelector("[type='email']");
 private By next=By.cssSelector("[class='VfPpkd-RLmnJb']");
public Loginpage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public WebElement emailid()
{
return driver.findElement(email);	
}
public WebElement next()
{
return driver.findElement(next);	
}
	

}
