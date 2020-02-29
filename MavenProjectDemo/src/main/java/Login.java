

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By email=By.xpath("//input[@id='email']");
	By pass=By.xpath("//input[@id='pass']");
	By login=By.xpath("//span[text()='Login']");
	public Login(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void typeEmail(String em){
		driver.findElement(email).sendKeys(em);
	}
	
	public void typePass(String pwd){
		driver.findElement(pass).sendKeys(pwd);
	}
	
	public void login(){
		driver.findElement(login).click();
	}
	
}
