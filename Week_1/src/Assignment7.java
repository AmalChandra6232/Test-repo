import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* * Launch the browser and up the url: http://demo.guru99.com/test/ajax.html 
 * * get the number of links in the webpage and print in console 
 * * get all the webelements with attribute value name
 *  * print the count of webelements * print the value of webelements 
 *  * click on the radio button 'No' * Navigate to https://www.tutorialspoint.com/index.htm
 *   * get the text "ENJOY PREMIUM CONTENT AT AFFORDABLE PRICE" driver.findElements Locator - tagname getText() method */

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		 List<WebElement> linkList=driver.findElements(By.tagName("a"));
		 System.out.println("Number of Links= "+linkList.size());
		 List<WebElement> links=driver.findElements(By.name("name"));
		 System.out.println("number of elements "+links.size());
		 for(int i=1;i<linkList.size();i++)
		 {
			System.out.println("Value= "+links.get(i).getAttribute("value"));
		 }
		 WebElement noRadio=driver.findElement(By.id("no"));
		 noRadio.click();
		 driver.navigate().to("https://www.tutorialspoint.com/index.htm");
		 WebElement textP=driver.findElement(By.tagName("h4"));
	     System.out.println(textP.getText());
		
		  
		  
		

	}

}
//<h4>You are browsing the best resource for <b>Online Education</b></h4>
//<input type="radio" id="no" name="name" value="No">

//<input type="radio" id="yes" name="name" value="Yes">


