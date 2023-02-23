package com.Facebook.Base;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Practiceforallmethods {

public static WebDriver driver;


public static void launchapplication()
{
driver= new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
  //enter username
      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      
   /* String textname=  driver.findElement(By.xpath("//div/p[contains(text(),'Forgot your password? ')]")).getText();
    Assert.assertEquals(textname,"Forgot your password?");
    System.out.println("textname matches with expected result"+ textname);*/
      
      
    //click on admin link
      
      Actions actions = new Actions(driver);
         WebElement adminlink=driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
       actions.moveToElement(adminlink).build().perform();

 
      WebElement Dashboardlink = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[8]"));
       actions.moveToElement(Dashboardlink).build().perform();
       
       //topdashboardlink
       WebElement topdashboardlink=driver.findElement(By.xpath("//span//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
       actions.moveToElement(topdashboardlink).build().perform();
       
       String topDashboardtitle=driver.getTitle();
      //ssert.assertEquals(topDashboardtitle, null)
       if(topDashboardtitle.equalsIgnoreCase("Dashboard"))
    	     		   {
    	   System.out.println("correct message is displayed");
    	   }
    	   else {
    		   System.out.println("correct message is not displayed");
    	     		   }
       
       
 /* driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
    driver.switchTo().window("Mainwindow");
    
    Set<String> ids= driver.getWindowHandles();
    Iterator<String> itr= ids.iterator();
    
    String firstname= itr.next();
    String secondname=itr.next();
    
    System.out.println("" +firstname);
    System.out.println("" +secondname);
    
    
 String text=driver.findElement(By.xpath("(//img[@alt='OrangeHRM Logo'])[2]")).getText();
 System.out.println(text);
   
   Assert.assertEquals(text,"OrangeHRM Logo");
   System.out.println("actstatus matches with expstatus");*/
   
   
   
   
}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 launchapplication();
		 

}
}