import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* * Launch http://demo.guru99.com/test/guru99home/ * maximize the window 
 * * Click on the image JMeter made easy at the bottom of the page * the image is inside a frame 
 * . Hence identify the frame by index and switch to the frame and click on the image
 *  * For switching the frame by Index, we need to find the index first. 
 *  * So we find the elements with tagname 'iframe' * we add a for loop to iterate with i<size 
 *  * inside the loop , we switch to each frame and check whether the required element is found by using
 *   findelements and size function * size greater than 0 indicates, we have that element. 
 *   * we perform the action on the element and break * we switch back to default content */
public class Assignment22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/guru99home/");	
	    driver.manage().window().maximize();
	    int size=driver.findElements(By.tagName("iFrame")).size();
	    System.out.println(size);
	    for(int i=0;i<size;i++) {
	    	driver.switchTo().frame(i);
	    	List<WebElement> img=driver.findElements(By.xpath("html/body/a/img"));
	    	int total=img.size();
	    	System.out.println(total);
	    	if(total>0) {
	    		driver.findElement(By.xpath("html/body/a/img")).click();
	    		break;
	    	}
	    	 driver.switchTo().defaultContent();
	    }
           
	}

}

//<img src="Jmeter720.png">


