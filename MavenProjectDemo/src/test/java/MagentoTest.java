import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	

	@Test
	public void testCase() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome W = new Welcome(driver);
		W.myAccount();
		
		Login L = new Login(driver);
		L.typeEmail("kcpkaranth@gmail.com");
		L.typePass("welcome#123");
		L.login();
		
		Home H = new Home(driver);
		H.logout();
		
		driver.quit();
	}
}
