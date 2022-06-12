import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exampleTest {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");	
		driver.findElement(By.xpath("//a[contains(@href,'login')]")).click();
		
		driver.close();
	} 

}
//<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login">Login<i class="fa fa-sign-in" aria-hidden="true"></i></a>
///<a href="http://www.opesmount.in/grocerystore1/index.php?route=account/login">Login<i class="fa fa-sign-in" aria-hidden="true"></i></a>
//body > header > div.cart-area > div > div > div.col-lg-6.col-sm-6.fav-area > ul > li:nth-child(2) > a
//<input class="gLFyf gsfi" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwiCurvs6L30AhWYHXAKHZzlCzkQ39UDCAQ">
//<input class="gNO89b" value="Google Search" aria-label="Google Search" name="btnK" type="submit" data-ved="0ahUKEwiCurvs6L30AhWYHXAKHZzlCzkQ4dUDCAs">
///html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input