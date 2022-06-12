import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* * Launch the browser and up the url(http://www.opesmount.in/grocerystore1/) 
 * * click on Login - CSS < a href> 
 * * Enter username - CSS <input id> 
 * * enter password - CSS <input id>
 *  * Click on forgotten password - CSS < a href> 
 *  * Enter email id - CSS <input name> 
 *  * click on Back - CSS <a class> */

public class Assignmnet9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.findElement(By.cssSelector("a[href='http://www.opesmount.in/grocerystore1/index.php?route=account/login']")).click();
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("amalc@gami.com");
		driver.findElement(By.cssSelector("input[id='input-password']")).sendKeys("adsa12547");
		driver.findElement(By.cssSelector("a[href='http://www.opesmount.in/grocerystore1/index.php?route=account/forgotten']")).click();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("amalc@gami.com");
		driver.findElement(By.cssSelector("a[class='btn btn-default']")).click();
		
		
		

	}

}




//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/forgotten">Forgotten Password</a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>