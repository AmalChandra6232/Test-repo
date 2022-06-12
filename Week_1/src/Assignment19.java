import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch http://demo.guru99.com/test/guru99home/
 * maximize the window
 * Find the no of iframes in the webpage
 * Click on the image JMeter made easy at the bottom of the page
 * the image is inside a frame . Hence identify the frame by ID and switch to the frame and click on the image
 */
public class Assignment19 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();	
		List<WebElement> iFrame=driver.findElements(By.tagName("iFrame"));
		System.out.println(iFrame.size());
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("/html/body/a/img")).click();
		
	}

}

//<iframe id="a077aa5e" name="a077aa5e" src="ads.html" width="750px;" height="110px;" scrolling="no"></iframe>

//<img src="Jmeter720.png">