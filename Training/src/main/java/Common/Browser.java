package Common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Browser {
	
  public static WebDriver driver;
  
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String wbsite, String br) {
	  if(br.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","//Users/NooN/eclipse-workspace/Training/Driver/chromedriver");
		  driver = new ChromeDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	  } else if(br.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver","//Users/NooN/eclipse-workspace/Training/Driver/geckodriver");
		  driver = new FirefoxDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	  } else {
		  System.out.println(br);
	  }
  }

  @AfterClass
  public void afterClass() {
  }
  public void screenshots(String source) throws IOException {
		
		  
		File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		FileUtils.copyFile(shots, new File(source+TimeStamp()+"screenshot.jpg"));

	  }
	  public String TimeStamp() {
		  SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		  Date date = new Date();
		  System.out.println(date);
		  return sdt.format(date);
		  
	  }

}
