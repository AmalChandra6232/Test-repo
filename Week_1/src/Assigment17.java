import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch the website “https://demoqa.com/browser-windows” 
 * Open all the child window.
   Iterate through all child windows and Switch to the child window 
   close the child windows and print " Child window is closed"
   Switch back to main window 
 */

public class Assigment17 {

	public static void main(String[] args) {
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://demoqa.com/browser-windows");	
	    String mainwindow=driver.getWindowHandle();
	    driver.findElement(By.id("tabButton")).click();
	    Set<String> s1 = driver.getWindowHandles();
	    Iterator<String> i1 = s1.iterator();
	   while (i1.hasNext()) {
	   	        	    String ChildWindow = i1.next();
	   	                if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
	   	                driver.switchTo().window(ChildWindow);
	                     WebElement text = driver.findElement(By.id("sampleHeading"));
	   	                System.out.println("Heading of child window is " + text.getText());
	   	                driver.close();
	   	                System.out.println("Child window 1 closed");
	   	            }
	   	        }    
	   	        
	   	        driver.switchTo().window(mainwindow);
	   
	   	        driver.findElement(By.id("windowButton")).click();
	   	        Set<String>s2=driver.getWindowHandles();
	   	        Iterator<String> i2=s2.iterator();
	   	        while(i2.hasNext()) {
	   	        	String ChildWindow2=i2.next();
	   	         if (!mainwindow.equalsIgnoreCase(ChildWindow2)) {
	   	             driver.switchTo().window(ChildWindow2);
	                 WebElement text = driver.findElement(By.id("sampleHeading"));
	   	             System.out.println("Heading of child window is " + text.getText());
	   	             driver.close();
	                 System.out.println("Child window 2 closed");
	   	        	
	   	        }
	            }
	   	     driver.switchTo().window(mainwindow);
	   	  driver.findElement(By.id("messageWindowButton")).click();
 	        Set<String>s3=driver.getWindowHandles();
 	        Iterator<String> i3=s3.iterator();
 	        while(i3.hasNext()) {
 	                      String ChildWindow3=i3.next();
 	                      if (!mainwindow.equalsIgnoreCase(ChildWindow3)) {
 	                      driver.switchTo().window(ChildWindow3);
 	                      driver.close();
                          System.out.println("Child window 3 closed");
 	        	
	}
}
	}
}


//<button id="windowButton" type="button" class="mt-4 btn btn-primary">New Window</button>
//<button id="messageWindowButton" type="button" class="btn btn-primary">New Window Message</button>
//<body>Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.</body>
//<body>Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.</body>










