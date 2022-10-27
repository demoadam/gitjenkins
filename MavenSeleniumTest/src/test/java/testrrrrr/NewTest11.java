package testrrrrr;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest11 {
	public WebDriver driver;

	@Test
	  public void googletest() {
		  driver.get("http://google.com");
	  }
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();

}
}