import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* * Launch the browser and up the url(https://login.salesforce.com/) 
 * * Enter username , print the value enetered, clear username - id 
 * * enter password - name * Check the checkbox - name 
 * * Check if checkbox is selected * get the number of links in the webpage and print it in console 
 * * close the driver Locators - id, name, Actions - sendkeys, click, clear */

public class Assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");	
		WebElement userName=driver.findElement(By.id("username"));
		userName.sendKeys("Amal");
		System.out.println("The username entered is "+userName.getAttribute("value"));//to get the value printed
		userName.clear();
		WebElement password=driver.findElement(By.name("pw"));
	    password.sendKeys("abc1254");
	    WebElement checkbox=driver.findElement(By.name("rememberUn"));
	    checkbox.click();
	    if(checkbox.isSelected())
	    {
	    	System.out.println("Checkbox is checked");
	    }
	    else
	    {
	    	System.out.println("Checkbox is unchecked");
	    }
	    List<WebElement> linkList=driver.findElements(By.tagName("a"));
	    System.out.println("Number of links= "+linkList.size());
	    driver.close();
	    

	}

}


//<h4>You are browsing the best resource for <b>Online Education</b></h4>


//<input class="input r4 wide mb16 mt8 username" type="email" value="" name="username" id="username" aria-describedby="error" style="display: block;">
//<input class="input r4 wide mb16 mt8 password" type="password" id="password" name="pw" onkeypress="checkCaps(event)" autocomplete="off">
//<input type="checkbox" class="r4 fl mr8" style="" id="rememberUn" name="rememberUn">