import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Navigate to http://www.calculator.net/percent-calculator.html 
 * * Maximize the browser * Enter value 10 in the first number of the percent Calculator
 *  * Get the text entered in the text box from the application 
 *  * Print the value in console */


public class Assignment11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.calculator.net/percent-calculator.html");
		 driver.manage().window().maximize();
		 WebElement textBox=driver.findElement(By.name("cpar1"));
		 textBox.sendKeys("10");
		 System.out.println(textBox.getAttribute("value"));
	}

}

//<input type="text" name="cpar1" id="cpar1" value="" class="inlong inpct">





