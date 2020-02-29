

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {

	WebDriver driver;
	By myacct=By.xpath("//a[text()='My Account']");
	
	public Welcome(WebDriver driver){
		this.driver=driver;
	}
	
	public void myAccount(){
		driver.findElement(myacct).click();
	}

	
}
