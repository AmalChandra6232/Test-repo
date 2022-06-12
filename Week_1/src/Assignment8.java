import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* * Launch the browser and up the url(http://www.opesmount.in/grocerystore1/) 
 * * click on Login using xpath < a href>
 *  * Enter username using xpath <input id> 
 *  * enter password using xpath <input id> 
 *  * Click on forgotten password using xpath <a href> 
 *  * Enter email id using xpath <input name>
 *   * click on Back using xpath <a class> */


public class Assignment8 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.opesmount.in/grocerystore1/");
		driver.findElement(By.xpath("//a[@href='http://www.opesmount.in/grocerystore1/index.php?route=account/login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("amalc@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("abcsl1254");
		driver.findElement(By.xpath("//a[@href='http://www.opesmount.in/grocerystore1/index.php?route=account/forgotten']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amalc@gmail.com");
		driver.findElement(By.xpath("//a[@class='btn btn-default']")).click();
		
	    
	}

}

////*[@id="input-email"]
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/forgotten">Forgotten Password</a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>