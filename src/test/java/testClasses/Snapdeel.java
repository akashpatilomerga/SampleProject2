package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeel {
  @Test
  public void snapdeel() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  //Add some new code
	  driver.get("https://www.snapdeal.com/");
	  Reporter.log("Opening Ebay", true);
	  Thread.sleep(3000);
	  driver.quit();
  }
}
