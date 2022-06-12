import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Xpath-Regular Expression * Launch the browser and up the url(http://www.opesmount.in/grocerystore1/) 
 * * click on Login - xpath < a href> * Enter username - xpath <input id> 
 * * enter password - xpath <input id> * Click on forgotten password - xpath <a href> 
 * * Enter email id - xpath <input name> * click on Back - xpath <a class> */


public class Assignment10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'-email')]")).sendKeys("amalc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("nana1254");
		driver.findElement(By.xpath("//a[contains(@href,'forgotten')]")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("amalc@gmail.com");
		driver.findElement(By.xpath("//a[contains(@text,'+91 9111111111')]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'btn')]")).click();
		
		
	}

}


//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">

//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login">Login<i class="fa fa-sign-in" aria-hidden="true"></i></a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/forgotten">Forgotten Password</a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>
//<a href="tel:+91 9111111111">+91 9111111111</a>













