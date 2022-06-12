import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/* 1. Launch http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html 2.
 *  Click on the button ' Click me to start timer' 
 *  wait till the text Webdriver is displayed below the button using explicit wait */

public class Assignment21 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	    WebDriverWait wait = new WebDriverWait(driver, 15);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	    System.out.println("WebDriver is visible");
	   

	}

}

//<button onclick="timedText()">Click me to start timer</button>


