import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*Invoke Google Chrome Browser Open URL: https://www.tutorialspoint.com/tutor_connect/index.php
 *  Select the 2nd option from the drop-down menu 
 *  Find the number of elements in the dropdown and
 *   print it in console Print all the options in the console Close the browser */



public class ClassAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/tutor_connect/index.php");
        driver.manage().window().maximize();
        WebElement dropDown=driver.findElement(By.name("selType"));
        Select dropDown1=new Select(dropDown);//object creation.
        dropDown1.selectByIndex(1);
       // dropDown1.deselectByValue("name");
        
        //dropDown1.selectByVisibleText("By Subject");
        List<WebElement> dropdownList = dropDown1.getOptions();
        for(int i=0;i<dropdownList.size();i++)
        {
        System.out.println(""+dropdownList.get(i).getText());	
        }
       // dropDown1.deselectByIndex(0);
       List<WebElement> allTags= driver.findElements(By.tagName("a"));
       System.out.println("size= "+allTags.size());
       
       for(int i=0;i<allTags.size();i++) {
    	  System.out.println("Links on page are: "+allTags.get(i).getAttribute("href"));
    	   //System.out.println("Links on page are: "+allTags.get(i).getText());
       }
	}

}


/*<select name="selType" class="search-control search-select">
                  <option value="subject">By Subject</option>
                  <option value="name">By Name</option>
                </select>*/
