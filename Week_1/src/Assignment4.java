import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch the browser and up the url(http://www.opesmount.in/grocerystore1/)
	 Click on Login using the locator strategy Link Text
	 Enter username using the locator strategy Id 
	 Clear username using the locator strategy Id 
	 Enter password using the locator strategy name
	 Click on forgotten password  using the locator strategy  Partial linkText
	 Enter email id  using the locator strategy  classname
	 Click on back link  using the locator strategy linkText
	 Close the driver*/
public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");	
		WebElement LoginLink = driver.findElement(By.linkText("Login"));
		LoginLink.click();
		WebElement userName=driver.findElement(By.id("input-email"));
		userName.sendKeys("abc@gamil.com");
		userName.clear();
		WebElement password=driver.findElement(By.name("password"));
	    password.sendKeys("abc1254");
	    WebElement fpassword=driver.findElement(By.partialLinkText("Forgotten"));
	    fpassword.click();
	    WebElement lemail=driver.findElement(By.className("form-control"));
	    lemail.sendKeys("anddjdkd");
	    WebElement backLink=driver.findElement(By.linkText("Back"));
	    backLink.click();
	  //  driver.close();
		}
}

//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login">Login<i class="fa fa-sign-in" aria-hidden="true"></i></a>

//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">

//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-control">
//<input type="password" name="password" value="" placeholder="Password" id="input-password" class="form-control">
//<input type="text" name="email" value="" placeholder="E-Mail Address" id="input-email" class="form-contro



//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login" class="btn btn-default">Back</a>

//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login">Login<i class="fa fa-sign-in" aria-hidden="true"></i></a>