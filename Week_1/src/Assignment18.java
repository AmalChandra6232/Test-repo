
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Launch http://demo.guru99.com/test/delete_customer.php
enter customer id : 53920
click submit button
get the text of the alert displayed and accept the alert
 */

public class Assignment18 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.findElement(By.name("cusid")).sendKeys("53920");
	    driver.findElement(By.name("submit")).click();
	    Alert alert=driver.switchTo().alert();
	    String alertMessage=alert.getText();
	    System.out.println(alertMessage);
	    Thread.sleep(5000);
	    alert.accept();
	    driver.switchTo().alert().accept();
	}

}

//<input type="text" name="cusid" maxlength="10">
//<input type="submit" name="submit" value="Submit">


