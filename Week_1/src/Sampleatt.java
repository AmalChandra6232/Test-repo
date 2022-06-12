import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleatt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> linkList=driver.findElements(By.tagName("a"));
		System.out.println("Number of links= "+linkList.size());

	}

}







//<a href="#" title="Home" rel="home" style="font-size:32px;">Demo Site</a>
//List<WebElement> linkList=driver.findElements(By.tagName("a"));
//System.out.println("Number of Links= "+linkList.size());