package fngpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/*testing comment */
public class FirstTestNGFile {
	public String baseurl = "https://po.sikkasoft.com/beta";
	public WebDriver driver = new FirefoxDriver();
	
  @Test
  public void verifyHomepageTitle() {
	  driver.get(baseurl);
	  String expectedTitle = "Practice Optimizer";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
  }
}
