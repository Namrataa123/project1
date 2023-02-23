package com.Facebook.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class Baseclass {
                 public static WebDriver driver;
                  public Properties prop;
                  public Logger logger= LogManager.getLogger(this.getClass());


	
@BeforeSuite
@Parameters("browsername")

public void setup(String br) throws IOException

{
	//reading values from properties
	prop = new Properties();
	 FileInputStream fis= new FileInputStream("C:\\Users\\namra\\OneDrive\\Documents\\Automation testing\\framework\\Resources\\config.properties");
	 prop.load(fis);
	
	 if(br.equalsIgnoreCase("chrome")) {
	//WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	logger.info("chrome browser is installed");
	
	 }else if(br.equalsIgnoreCase("edge")) {
		// WebDriverManager.edgedriver().setup();
		 driver= new EdgeDriver();
		 System.out.println("Edge browser is launched successfully");
	 }else if (br.equalsIgnoreCase("firefox")){
		 //WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
		 System.out.println("Firefox browser is launched successfully");
	 }else {
		 
		 System.out.println("supported browser are chrome/edge/firefox");
		 
	 }
	 driver.manage().window().maximize();
	 //driver.get("https://www.facebook.com/login.php/");
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
	
	}


public void capturescreen(WebDriver driver,String testname)
{
	/*
	TakesScreenshot ts= (TakesScreenshot)driver;
	Filesource fs =ts.getScreenshotAs(OutputType.FILE);
	FileTarget = new File(System.getProperty("User.dir"))+"\\screenshots"+testname +".png ");
	FileUtils.
	*/
}



private void teardown() {
	// TODO Auto-generated method stub
	driver.quit();
	System.out.println("application closed successfully");
}

}
