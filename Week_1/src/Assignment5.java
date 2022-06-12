import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");	
		
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("abc@gamil.com");
		userName.clear();
		WebElement password=driver.findElement(By.name("pass"));
	    password.sendKeys("abc1254");
	    WebElement fpassword=driver.findElement(By.partialLinkText("Forgotten"));
	    fpassword.click();
	    WebElement lemail=driver.findElement(By.className("inputtext"));
	    lemail.sendKeys("9876543210"); 
	    WebElement cancelKey=driver.findElement(By.linkText("Cancel"));
	    cancelKey.click();
	    //driver.close();
	}

}


//<a role="button" class="_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy" href="/login.php">Cancel</a>
//<input type="text" class="inputtext _9o1w" id="identify_email" name="email" placeholder="Mobile number" autofocus="1" aria-label="Mobile number">
//<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass" data-testid="royal_pass" placeholder="Password" aria-label="Password">
//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">