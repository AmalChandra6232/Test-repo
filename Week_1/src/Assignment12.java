import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* http://www.testdiary.com/training/selenium/selenium-test-page/ 
 * * Locate both the checkboxes and check whether they are selected.
 * * Print in the console whether they are selected 
 * * Check whether Save button is enabled , print in the console 
 * * Check whether Save button is displayed , print in the console */

public class Assignment12 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		driver.manage().window().maximize();
		WebElement checkBox1=driver.findElement(By.id("seleniumbox"));
		WebElement checkBox2=driver.findElement(By.id("restapibox"));
		boolean box1=checkBox1.isSelected();
		boolean box2=checkBox2.isSelected();
		if(box1==true)
		{
			System.out.println("Selenium checkBox is Selected");
		}
		else
		{
			System.out.println("Selenium checkBox is not Selected");
		}
		if(box2==true)
		{
			System.out.println("Rest Api checkBox is Selected");
		}
		else
		{
			System.out.println("Rest Api checkBox is not Selected");
		}
		System.out.println(driver.findElement(By.id("demo")).isEnabled());
		System.out.println(driver.findElement(By.id("demo")).isDisplayed());
		

	}

}


//<input id="seleniumbox" name="selenium" type="checkbox" value="1&quot;">
//<input id="restapibox" checked="checked" name="restapi" type="checkbox" value="1">
//<button id="demo" disabled="disabled" type="button">Save</button>




