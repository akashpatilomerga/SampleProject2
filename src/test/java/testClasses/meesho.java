package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class meesho {
  @Test
  public void meeshoApp() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.meesho.com/");
	  driver.close();
	  
  }
}
