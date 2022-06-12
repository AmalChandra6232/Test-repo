import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserLaunch_Chrome {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("input[@class='gLFyf gsfi']")).sendKeys("cars");
		
		driver.findElement(By.xpath("div[@class='FPdoLc lJ9FBc']// parent :: center")).click();
		
		//driver.get("https://google.com");
		//Thread.sleep(5000);
	}

}
////div[@class='FPdoLc lJ9FBc']// parent :: center