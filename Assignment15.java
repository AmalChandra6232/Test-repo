import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Login to https://opensource-demo.orangehrmlive.com/
 *  * login to the application - Admin and admin123 
 *  * Context click admin module */

public class Assignment15 {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.name("Submit")).click();
		    WebElement adminMode=driver.findElement(By.tagName("b"));
		    Actions obj=new Actions(driver);
		    obj.moveToElement(adminMode).contextClick()
		    .build().perform();
			
			
	}

}

//<input name="txtUsername" id="txtUsername" type="text">
//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
//<b>Admin</b>

