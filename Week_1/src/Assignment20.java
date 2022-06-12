import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch the browser and open the site " http://demo.guru99.com/popup.php " Click on link "Click Here ".
 *  A new window opens, ask the user to enter email id and submit the page.
 *  Enter email ID and submit.
 *  Close the Child window on which credentials are displayed.
 *  Switch to the parent window. */
public class Assignment20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get(" http://demo.guru99.com/popup.php ");
	    String mainwindow=driver.getWindowHandle();
	    driver.findElement(By.linkText("Click Here")).click();
	    Set<String> s1=driver.getWindowHandles();
	    Iterator<String> i1 = s1.iterator();
		   while (i1.hasNext()) {
		       String ChildWindow = i1.next();
               if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
		   	   driver.switchTo().window(ChildWindow);
		   	   driver.findElement(By.name("emailid")).sendKeys("amalc6232@gmail.com");
		   	   driver.findElement(By.name("btnLogin")).click();
		   	   Thread.sleep(5000);
		   	   driver.close();
               System.out.println("Child window closed");
	        }
           }
		   
		  driver.switchTo().window(mainwindow);
		  driver.quit();
	}
}


//<a href="../articles_popup.php" target="_blank" style="font-size:16px;">Click Here</a>
//<input type="text" name="emailid" maxlength="50">
//<input type="submit" name="btnLogin" value="Submit">



